import java.util.Scanner;
public class Q1{
    public static void alternative_char(String s){
        for(int i=0;i<s.length();i+=2){
            System.out.print(s.charAt(i));
        }
    }
    public static void alternative_vowels(String s){
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            String k = s.charAt(i)+"";
            if (k.matches("[aeiouAEIOU]")) {
                if (flag) {
                    System.out.print(s.charAt(i));
                }
                flag = ! flag;
            }
        }
    }

    public static void biggestAndLowest(String s){
        String big = "";
        int ind = s.indexOf(' ');
        String small = s.substring(0,ind+1);
        int formIndex = 1;
        s = " "+s+" ";
        int r = s.indexOf(' ',formIndex);
        while (r != -1) {
           String word = s.substring(formIndex,r);
            if (word.length()>big.length()) {
                big = word;
            }
            if (word.length()<small.length()) {
                small = word;
            }
            formIndex = r+1;
            r = s.indexOf(' ',formIndex);
        }
        System.out.println("Small :"+small);
        System.out.println("Big :"+big);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //alternative_char(s);
        //alternative_vowels(s);
        biggestAndLowest(s);
    }
}