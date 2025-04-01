import java.util.Scanner;//
public class Convert_Kg_to_Grams {
    public int converter(int n){
        int result = 1000*n;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);//
        int n = in.nextInt();//
        Convert_Kg_to_Grams obj = new Convert_Kg_to_Grams();
        int result = obj.converter(n);
        System.out.println(result);
        in.close();
        
    }
}
