public class numberOfChar {
    public static void main(String[] args) {
        String s = "SIVA VENKATA NAGA PHANI KUMAR";
        // for(int i=0;i<s.length();i++){
        //     if (s.charAt(i)=='A') {
        //         System.out.println(i);
        //     }
        // }
        char ch = 'A';
        int k = s.indexOf(ch);
        while (k != -1) {
            System.out.println(k);
            k = s.indexOf(ch,k+1);
        }
    }
}
