import java.util.Stack;

public class stack_using_Collections {
    public static void pushatBottom(int data,Stack<Integer>s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottom(data, s);
        s.push(top);
    }
    public static void revereStack(Stack<Integer>s){
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        revereStack(s);
        pushatBottom(top, s);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        revereStack(s);
        
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
