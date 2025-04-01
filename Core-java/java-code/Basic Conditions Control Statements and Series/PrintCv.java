public class PrintCv {
    public void print(int i){
        while (i<=33) {
            System.out.println(i+"CVCORP");
            i++;
        }
    }
    public static void main(String[] args) {
        PrintCv obj = new PrintCv();
        int i = 1;
        obj.print(i);
        
    }
}
