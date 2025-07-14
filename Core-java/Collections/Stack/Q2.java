import java.util.*;
public class Q2 { 
    public static boolean isValid(String s) { 
	Stack<Character> stack = new Stack<>();
	for (char c : s.toCharArray()) { 
		if (c == '(') { 
			stack.push(')');
        } 
		else if (c == '{') { 
			stack.push('}');
        } 
		else if (c == '[') { 
			stack.push(']');
        } 
		else if (stack.isEmpty() || stack.pop() != c) { 
			return false;
        } 
	} 
	return stack.isEmpty();
} 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    } 
} 