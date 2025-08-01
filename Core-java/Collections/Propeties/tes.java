import java.io.*;
import java.util.*;

public class tes {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileReader fr = new FileReader("C:\\Users\\phani\\OneDrive\\Desktop\\phanindrajaychand\\Core-java\\Collections\\Propeties\\test.propeties");
        p.load(fr);
        FileWriter fw = new FileWriter("C:\\Users\\phani\\OneDrive\\Desktop\\phanindrajaychand\\Core-java\\Collections\\Propeties\\test.propeties");
        System.out.println(p.getProperty("101"));
        p.setProperty("101", "hello");
        p.store(fw, "updated");
        p.store(fw,"hgfc");
        Enumeration e = p.propertyNames();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s + " = " + p.getProperty(s));
        }
    }
}