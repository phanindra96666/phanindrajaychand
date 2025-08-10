import java.io.*;

public class f5 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\first.txt");
        File f2 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\second.txt");
        File f3 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\third.txt");

        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();

        FileInputStream fis1 = new FileInputStream(f1);
        FileInputStream fis2 = new FileInputStream(f2);
        FileInputStream fis3 = new FileInputStream(f3);

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int n;
        while ((n = sis.read())!=-1) {
            System.out.print((char)n);
        }
        sis.close();
    }
}
