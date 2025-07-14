//import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

class Q1{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){ 
            st.push(sc.nextInt());
        } 
        // Enumeration <Integer> e = st.elements();
        // while (e.hasMoreElements()) {
        //     System.out.println("Print :"+e.nextElement());
        // }
        while(!st.isEmpty()){ 
            System.out.print(st.pop()+" ");
        } 
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st);
        // System.out.println(st.search(1));
        sc.close();
    } 
} 