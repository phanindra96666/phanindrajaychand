
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class employee implements Serializable {
    private int emp_Id;
    private String emp_Name;
    transient private double emp_sal;

    employee(int id,String name,double sal ) {
        this.emp_Id = id;
        this.emp_Name = name;
        this.emp_sal = sal;
    }
    public String getName(){
        return emp_Name;
    }
    public int getId(){
        return emp_Id;
    }
     public double getSalary(){
        return emp_sal;
    }
}
public class f6 {
    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {
        File f = new File("C:\\Users\\phani\\OneDrive\\Desktop\\third.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        employee e1 = new employee(1, "phani", 1000);
        employee e2 = new employee(1, "saii", 2000);
        employee e3 = new employee(1, "phani", 3000);
        oos.writeObject(e1);
        oos.writeObject(e2);
        oos.writeObject(e3);
        oos.flush();
        oos.close();


        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while(true){
                employee x = (employee) ois.readObject();
                System.out.print(x.getId()+" "+x.getName()+" "+x.getSalary());
            }
            
        } catch (EOFException e) {
        }
        ois.close();
    }
}
