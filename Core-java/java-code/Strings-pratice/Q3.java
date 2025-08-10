public class Q3 {
    public static void main(String[] args) {
        String s = "Hii hello Hii jj ww er ww";
        String [] a = s.split(" ");
        boolean [] b = new boolean[a.length];

        for(int i=0;i<a.length;i++){
            if (!b[i]) {
                int count = 1;
                for(int j=i+1;j<a.length;j++){
                    if (a[i].equals(a[j])) {
                        count++;
                        b[j] = true;
                    }
                }
                System.out.println(a[i]+" "+count);
            }
        }
    }
}
