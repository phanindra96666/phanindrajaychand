import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort_arraylist {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        int a = in.nextInt();
        myNumbers.add(a);
    }

    Collections.sort(myNumbers, Collections.reverseOrder());
    System.out.println("Answer: ");
    for (int i : myNumbers) {
      System.out.println(i);
    }
    in.close();
  }
}
