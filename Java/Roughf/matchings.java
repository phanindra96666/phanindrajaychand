public class matchings {

    public static int myfun(String inputs){
        int balance = 0;
        int error = 0;

        for(char ch : inputs.toCharArray()){
            if (ch == '(') {
                balance++;
            }
            else if (ch ==')') {
                if (balance>0) {
                    balance--;
                }
                else{
                    error++;
                }
            }
        }
        error+=balance;
        return error;
    }
    public static void main(String[] args) {
        String input = "(())))";
        int error = myfun(input);
        System.out.println(error);
    }
}
