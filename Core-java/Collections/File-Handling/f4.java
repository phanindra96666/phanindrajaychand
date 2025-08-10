import java.io.*;

public class f4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\first.txt");
        File f2 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\second.txt");
        File f3 = new File("C:\\Users\\phani\\OneDrive\\Desktop\\third.txt");

        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();

        FileOutputStream fos1 = new FileOutputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f2);
        FileOutputStream fos3 = new FileOutputStream(f3);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        String data = "This is a sample text that will be written to multiple files.";
        
        bos.write(data.getBytes());
        
        bos.writeTo(fos1);
        
        bos.writeTo(fos2);
        
        bos.writeTo(fos3);
      
        bos.close();
        
        System.out.println("Data written to all files.");
    }
}
