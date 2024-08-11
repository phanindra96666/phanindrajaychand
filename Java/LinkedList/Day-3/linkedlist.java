public class linkedlist {
    Node head;
    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast (String data){
        Node newNode = new Node(data);
        Node curNode = head;
        while (curNode.next != null) {
            curNode=curNode.next;
        }
        curNode.next = newNode;
    }

    public void printList(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode!= null) {
            System.out.print(curNode.data+"==>");
            curNode=curNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        linkedlist L = new linkedlist();
        L.addfirst("hello");
        L.addfirst("hhhhh");
        L.addLast("naby");
        L.printList();
    }
}
