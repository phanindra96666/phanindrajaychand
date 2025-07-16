//Reverse Polish Notation

import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        String[] tokens = {"10", "7", "5", "+", "-", "8", "*", "20", "+", "7", "%"};
        if (tokens.length>1) {
            int result = evaluateRPN(tokens);
            System.out.println("Result: " + result);
        }
        else{
            System.out.print("Invalid");
        }
        
    }

    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);
                    break;  
                case "%":
                    int c = stack.pop();
                    int d = stack.pop();
                    stack.push(d%c);
                    break;        
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                default:{
                    stack.push(Integer.parseInt(token));
                    break;
                }
            }
        }
        return stack.pop();
    }
}