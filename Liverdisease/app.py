from flask import Flask, render_template, request
import pickle
import pandas as pd

app = Flask(__name__)

# Load the trained model and preprocessor
with open('model.pkl', 'rb') as f:
    model = pickle.load(f)

with open('preprocessor.pkl', 'rb') as f:
    preprocessor = pickle.load(f)   

# Define a function to preprocess input data
def preprocess_input(data):
    # Convert data to DataFrame
    input_data = pd.DataFrame(data, index=[0])
    
    # Ensure data types and column order
    input_data['Gender'] = input_data['Gender'].astype(str)
    
    # Apply preprocessor
    input_transformed = preprocessor.transform(input_data)
    
    return input_transformed

@app.route('/')
def home():
    return render_template('index.html')
    

@app.route('/predict', methods=['POST'])
def predict():
    if request.method == 'POST':
        # Get data from the form
        new_data = {
            'Age': float(request.form['Age']),
            'Gender': request.form['Gender'],
            'Alkaline Phosphotase (IU/L)': float(request.form['Alkaline Phosphotase (IU/L)']),
            'SGPT/ALT (U/L)': float(request.form['SGPT/ALT (U/L)']),
            'SGOT/AST (U/L)': float(request.form['SGOT/AST (U/L)']),
            'Total Bilirubin (mg/dL)': float(request.form['Total Bilirubin (mg/dL)']),
            'Direct Bilirubin (mg/dL)': float(request.form['Direct Bilirubin (mg/dL)']),
            'Albumin (g/dL)': float(request.form['Albumin (g/dL)']),
            'Total Proteins (g/dL)': float(request.form['Total Proteins (g/dL)']),
            'Liver Disease': float(request.form['Liver Disease']),
        }

        try:
            # Preprocess input data
            input_transformed = preprocess_input(new_data)

            # Make predictions
            prediction = model.predict(input_transformed)

            return render_template('result.html', prediction=prediction[0])
        except Exception as e:
            error_message = "An error occurred: {}".format(str(e))
            return render_template('error.html', error_message=error_message)

if __name__ == '__main__':
    app.run(debug=True)
