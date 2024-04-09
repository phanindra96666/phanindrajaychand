import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt 
import seaborn as sns   
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn import svm 
from sklearn.neighbors import KNeighborsClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn import metrics 
from sklearn.preprocessing import StandardScaler, LabelEncoder, OneHotEncoder
from sklearn.impute import SimpleImputer
from sklearn.pipeline import Pipeline
from sklearn.compose import ColumnTransformer
from sklearn.metrics import accuracy_score, classification_report,roc_curve, auc
import warnings 
warnings.filterwarnings("ignore")

dataset=pd.read_csv(r"C:\Users\phani\OneDrive\Desktop\Liverdisease\Liver.csv")


print(dataset.head())

print(dataset.shape)

print(dataset.isna().sum())

print(dataset.fillna(0, inplace=True))

# Convert categorical columns to string type to handle mixed types
categorical_columns = ['Gender']

for column in categorical_columns:
    dataset[column] = dataset[column].astype(str)

# Separate features and target variable
x = dataset.drop('Result', axis=1)
y = dataset['Result']

print(x)
print(y)

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25, random_state=42)

print(x.shape,x_train.shape,y_train.shape)

# Define categorical and numerical features
categorical_features = x.select_dtypes(include=['object']).columns
numerical_features = x.select_dtypes(include=['int64', 'float64']).columns

# Create transformers
categorical_transformer = Pipeline(steps=[
    ('imputer', SimpleImputer(strategy='constant', fill_value='missing')),
    ('onehot', OneHotEncoder(handle_unknown='ignore'))
])

numerical_transformer = Pipeline(steps=[
    ('imputer', SimpleImputer(strategy='mean')),
    ('scaler', StandardScaler())
])

# Apply transformers based on feature types
preprocessor = ColumnTransformer(
    transformers=[
        ('num', numerical_transformer, numerical_features),
        ('cat', categorical_transformer, categorical_features)
    ]
)

# Preprocess the data
x_train_preprocessed = preprocessor.fit_transform(x_train)
x_test_preprocessed = preprocessor.transform(x_test)


# Define and train the RandomForestClassifier
model = RandomForestClassifier(random_state=42)
model_pipeline = Pipeline(steps=[('preprocessor', preprocessor), ('model', model)])
model_pipeline.fit(x_train, y_train)

# Make predictions
y_pred = model_pipeline.predict(x_test)

# Evaluate the model
accuracy = accuracy_score(y_test, y_pred)
print('Random Forest Classifier Accuracy:', accuracy * 100)

# Define and train the KNeighborsClassifier
model = KNeighborsClassifier()  # Change here
model_pipeline = Pipeline(steps=[('preprocessor', preprocessor), ('model', model)])
model_pipeline.fit(x_train, y_train)

# Make predictions
y_pred = model_pipeline.predict(x_test)

# Evaluate the model
accuracy = accuracy_score(y_test, y_pred)
print('K-Nearest Neighbors Classifier Accuracy:', accuracy * 100)

# Define and train the LogisticRegression
model = LogisticRegression()  # Change here
model_pipeline = Pipeline(steps=[('preprocessor', preprocessor), ('model', model)])
model_pipeline.fit(x_train, y_train)

# Make predictions
y_pred = model_pipeline.predict(x_test)

# Evaluate the model
accuracy = accuracy_score(y_test, y_pred)
print('Logistic Regression Classifier Accuracy:', accuracy * 100)

# Define and train the Support Vector Machine (SVM) Classifier
svm_model = svm.SVC(kernel='linear', random_state=42)  # You can change the kernel type and other parameters as needed
svm_model_pipeline = Pipeline(steps=[('preprocessor', preprocessor), ('model', svm_model)])
svm_model_pipeline.fit(x_train, y_train)

# Make predictions
y_pred_svm = svm_model_pipeline.predict(x_test)

# Evaluate the model
accuracy_svm = accuracy_score(y_test, y_pred_svm)
print('Support Vector Machine (SVM) Classifier Accuracy:', accuracy_svm * 100)


from sklearn.model_selection import cross_val_score

# Define RandomForestClassifier pipeline
model_rf = RandomForestClassifier(random_state=42)
model_pipeline_rf = Pipeline(steps=[('preprocessor', preprocessor), ('model', model_rf)])

# Perform cross-validation for RandomForestClassifier
cv_scores_rf = cross_val_score(model_pipeline_rf, x_train, y_train, cv=5)  # 5-fold cross-validation

# Print cross-validation scores for RandomForestClassifier
print('RandomForestClassifier Cross-validation scores:', cv_scores_rf)
print('RandomForestClassifier Mean cross-validation score:', cv_scores_rf.mean())


# Define KNeighborsClassifier pipeline
model_knn = KNeighborsClassifier()
model_pipeline_knn = Pipeline(steps=[('preprocessor', preprocessor), ('model', model_knn)])

# Perform cross-validation for KNeighborsClassifier
cv_scores_knn = cross_val_score(model_pipeline_knn, x_train, y_train, cv=5)  # 5-fold cross-validation

# Print cross-validation scores for KNeighborsClassifier
print('KNeighborsClassifier Cross-validation scores:', cv_scores_knn)
print('KNeighborsClassifier Mean cross-validation score:', cv_scores_knn.mean())


from sklearn.model_selection import cross_val_score

# Define SVM classifier pipeline
model_svm = svm.SVC(kernel='linear', random_state=42)  # You can change the kernel type and other parameters as needed
model_pipeline_svm = Pipeline(steps=[('preprocessor', preprocessor), ('model', model_svm)])

# Perform cross-validation for SVM
cv_scores_svm = cross_val_score(model_pipeline_svm, x_train, y_train, cv=5)  # 5-fold cross-validation

# Print cross-validation scores for SVM
print('Support Vector Machine (SVM) Cross-validation scores:', cv_scores_svm)
print('Support Vector Machine (SVM) Mean cross-validation score:', cv_scores_svm.mean())

# Import confusion_matrix from sklearn.metrics
from sklearn.metrics import confusion_matrix

# Make predictions on the test data
y_pred = model_pipeline.predict(x_test)

# Create a confusion matrix
cm = confusion_matrix(y_test, y_pred)

# Print the confusion matrix
print("Confusion Matrix:")
print(cm)


# Compute ROC curve
fpr, tpr, thresholds = roc_curve(y_test, model_pipeline.predict_proba(x_test)[:,1])

# Plot ROC curve
plt.figure(figsize=(8, 6))
plt.plot(fpr, tpr, color='blue', lw=2, label='ROC curve')
plt.plot([0, 1], [0, 1], color='red', linestyle='--', lw=2, label='Random guess')
plt.xlabel('False Positive Rate')
plt.ylabel('True Positive Rate')
plt.title('ROC Curve')
plt.legend(loc='lower right')
plt.show()



# Create a heatmap of the confusion matrix
plt.figure(figsize=(8, 6))
sns.heatmap(cm, annot=True, cmap="Blues", fmt="d", xticklabels=model.classes_, yticklabels=model.classes_)
plt.xlabel('Predicted')
plt.ylabel('Actual')
plt.title('Confusion Matrix')
plt.show()

# Example code for plotting learning curve
from sklearn.model_selection import learning_curve
train_sizes, train_scores, test_scores = learning_curve(model_pipeline, x_train, y_train, cv=5)
plt.plot(train_sizes, np.mean(train_scores, axis=1), label='Training score')
plt.plot(train_sizes, np.mean(test_scores, axis=1), label='Cross-validation score')
plt.xlabel('Training set size')
plt.ylabel('Accuracy')
plt.title('Learning curve')
plt.legend()

plt.show()

# Define new_data with lists of the same length
new_data = pd.DataFrame({
    'Age': [60],
    'Gender': ['Male'],
    'Alkaline Phosphotase (IU/L)': [240],
    'SGPT/ALT (U/L)': [70],
    'SGOT/AST (U/L)': [70],
    'Total Bilirubin (mg/dL)': [3.5],
    'Direct Bilirubin (mg/dL)': [1.5],
    'Albumin (g/dL)': [2.8],
    'Total Proteins (g/dL)': [7],
    'Liver Disease': [1],
})

# Ensure that the column names and data types match the training data
new_data = new_data.astype({'Gender':str})


# Make predictions using the trained model
new_data_pred = model_pipeline.predict(new_data)

# Display predictions
print('Predictions for new data:')
print(new_data_pred)

import pickle

# Saving model to disk
with open('model.pkl','wb') as file:
    pickle.dump(model, file)

with open('preprocessor.pkl', 'wb') as file:
    pickle.dump(preprocessor,file)