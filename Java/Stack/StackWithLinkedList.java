public class StackWithLinkedList {
    public static Node Head;
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }
    }

     static class Stack{
        public void push(int data){
            Node newNode = new Node(data);
            if (Head==null) {
                Head=newNode;
                return;
            }
            newNode.next=Head;
            Head=newNode;
        }

        public boolean isEmpty() {
            return Head == null;
        }

        public int pop(){
            if (Head==null) {
                return -1;
            }
            int top = Head.data;
            Head=Head.next;
            return top;
        }

        public int peek(){
            if (Head==null) {
                return -1;
            }
            return Head.data;
        }
     }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}