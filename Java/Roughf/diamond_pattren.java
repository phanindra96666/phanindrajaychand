import java.util.Scanner;  
public class diamond_pattren{  
public static void main(String args[]){  
Scanner scan=new Scanner(System.in);  
int n=5;  
String s="*";  
for(int i=1; i<=n; i++){  
    for(int j=n; j>i; j--){  
    System.out.print(" ");  
    }  
    System.out.print(s);  
        for(int j=1; j<(i-1)*2; j++){  
             System.out.print(" ");
             }  
             if(i==1){  
                 System.out.println();  
             }  
             else{  
                 System.out.print(s);  
                 System.out.println();
            }  
        }
     //Second part
    for(int i=n-1; i>=1; i--){  
        for(int j=n; j>i; j--){  
            System.out.print(" ");  
        }  
        System.out.print(s);  
            for(int j=1; j<(i-1)*2; j++){  
                System.out.print(" ");  
            }  
            if(i==1){  
                System.out.println();  
            }  
            else{  
                System.out.print(s);
                System.out.println();  
            }  
            scan.close();
}  
}  
}  