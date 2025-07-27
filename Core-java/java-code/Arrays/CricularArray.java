public class CricularArray {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[(i+j)%n]+" ");
            } 
            System.out.println();    
        }
    }
}
