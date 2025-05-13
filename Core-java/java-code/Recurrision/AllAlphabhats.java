public class AllAlphabhats {
    public static void allAlphabats(char al ){
        if (al<='z') {
            System.out.print(al);
            allAlphabats((char)(al+1));
        }
    }
        
    public static void main(String[] args) {
        allAlphabats('a');
    }
}
