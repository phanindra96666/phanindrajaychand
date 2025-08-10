import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class f3 {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\phani\\OneDrive\\Desktop\\second.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        String s = "Hi Hello";
        byte a[] = s.getBytes();
        fos.write(a);
        fos.flush(); 
        fos.close();
        FileInputStream fis = new FileInputStream(f);
        int n;
        while ((n=fis.read())!=-1) {
            System.out.print((char)n);
        }
        fis.close();
    }
}
