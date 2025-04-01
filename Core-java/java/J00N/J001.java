public class J001 {
    public static char m1(Boolean a){
        if (a) {
            return 'a';
        }
        else{
            return 'b';
        }
    }
    public int m2(String a){

        return 0;
    }
    public static void main(String[] args) {
        J001 obj = new J001();
        char c = m1(true);
        int x = obj.m2("phani");
        System.out.println(c);
        System.out.println(x);
    }
}
