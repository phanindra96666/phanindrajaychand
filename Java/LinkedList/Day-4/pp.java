public class pp {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cuNode = head;
        while (cuNode.next!=null) {
            cuNode = cuNode.next;
        }
        cuNode.next = newNode;
    }
    public void delFirst(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        head = head.next;
    }

    public void delLast(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node cuNode = head;
        while (cuNode.next.next!=null) {
            cuNode=cuNode.next;
        }
        cuNode.next = null;
    }

    public void addpos(int data ,int pos){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode =  new Node(data);
        Node cuNode = head;
        int count = 0;
        while (cuNode!=null && count<pos-1) {
            cuNode = cuNode.next;
            count++;
        }
        newNode.next = cuNode.next;
        cuNode.next = newNode;
    }
    public void delpos(int pos){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node cuNode = head;
        int count = 0;
        Node newCurnode = head.next;
        while (cuNode!=null && count<pos-1){
            cuNode = cuNode.next;
            newCurnode=newCurnode.next;
            count++;
        }
        cuNode.next = newCurnode.next;
    }

    public void printList(){
        if (head == null) {
            System.out.print("List is empty");
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+"==>");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        pp list = new pp();
        list.addLast(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.delFirst();
        list.delLast();
        list.printList();
        list.delpos(1);
        list.printList();
       
    }
}