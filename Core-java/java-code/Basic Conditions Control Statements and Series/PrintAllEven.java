public class PrintAllEven {
    public void print(){
        for(int i=700;i<900;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrintAllEven obj = new PrintAllEven();
        obj.print();
    }
}
