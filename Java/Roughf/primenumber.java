import java.util.*;
public class primenumber{
   public static void main (String[] args){	
      Scanner in = new Scanner(System.in);	
      int n = in.nextInt();
      int [] arr = new int[n];
      int index = 0;
       for (int i = 2; i <= n; i++){ 		  	  
          int count = 0; 	  
          for(int num = 1; num*num <= i; num++){
             if(i % num == 0){
               if (i / num == num) {
                  count++;  
              } else {
                  count += 2;  
              }
	         }
	      }
         if (count == 2){
            arr[index] = i;
            index++;
         }
       }	
      System.out.print("Prime Numbers are :");
      for(int i=0;i<index;i++){
         System.out.print(arr[i]+" ");
      }
      in.close();
   }
}
/*public class primenumber{
   public static void main (String[] args) {		
       int i = 1;
       int num = 0;
       String primeNumbers = "";

       while (i <= 100) { 		  	  
          int counter = 0; 	  
          num = i;
          
          while (num >= 1) {
             if (i % num == 0) {
                 counter = counter + 1;
             }
             num--;
          }
          
          if (counter == 2) {
             primeNumbers = primeNumbers + i + " ";
          }
          
          i++;
       }	
       
       System.out.println("Prime numbers from 1 to 100 are:");
       System.out.println(primeNumbers);
   }
}*/

