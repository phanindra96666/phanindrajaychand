public class trycatch {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        try{
            System.out.print(i/j);
        }
        catch(ArithmeticException e){
            System.out.print(e.toString());
        }
    }
}
