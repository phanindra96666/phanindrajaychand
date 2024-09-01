public class spaces_string {
    public static void main(String[] args) {
        String s = "All izz well  ";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' ') {
                count++;
            }
            else if(s.charAt(i) ==' ' && count!=0){
                break;
            }
        }
        System.out.println(count);
    }
}
