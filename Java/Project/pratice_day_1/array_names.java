import java.util.Scanner;
public class array_names {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("number of names :");
        int n = in.nextInt();
        String[] myarr = new String [n];
        for(int i=0;i<n;i++){
            myarr[i]=in.next();
        }
        System.out.println("The names are :");
        for(int i=0;i<n;i++){
                System.out.print(myarr[i]+",");
            }
            in.close();
        }
    }

