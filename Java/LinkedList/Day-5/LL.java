public class LL { 
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverseList(){
        if (head==null || head.next==null) {
            return;
        }
        Node prevNode = null;
        Node curNode = head;
        while (curNode!=null) {
            Node newNode = curNode.next;
            curNode.next = prevNode;
            //update
            prevNode = curNode;
            curNode = newNode;
        }
        head.next = null;
    }

    public void delpos(int pos){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curNode = head;
        int count = 0;
        Node newCurNode = head.next;
        while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            newCurNode=newCurNode.next;
            count++;
        }
        curNode.next = newCurNode.next;
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data+"=>");
            curNode = curNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Welcome");
        list.addFirst("Sai");
        list.addFirst("Phani");
        list.addFirst("Hello");
        list.printList();
        list.delpos(0);
        list.printList();
    }
}
