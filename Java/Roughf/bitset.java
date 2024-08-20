public class bitset {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        if ((bitmask|n)==0) {
            System.out.println("Bit was zero");
        } 
        else{
            System.out.println("Bit was one");
        }

        int newnumber = bitmask|n;
        System.out.println(newnumber);
    }
    
}
