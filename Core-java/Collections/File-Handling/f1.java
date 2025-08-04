import java.io.*;

public class f1{
    public static void main(String[] args)throws IOException{
        File f = new File("C:\\Users\\phani\\OneDrive\\Desktop\\first.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,true);
        
        fw.write("hello");
        fw.close();
        FileReader fr = new FileReader(f);
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(brr.readLine());
        System.out.println(n);
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        while ((s = br.readLine())!=null) {
            System.out.print(s);
        }
        fr.close();
        br.close();
    }
}