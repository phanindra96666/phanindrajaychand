public class LL { 
    Node head;
    public class Node { 
        String data;
        Node next;

        Node(String data){ 
            this.data=data;
            this.next = null;
        } 
    } 

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next!=null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void deleteFirst(){
        if (head==null) {
            System.out.print("List is empty");
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head==null) {
            System.out.print("List is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next=null;
    }

    public void addpos(String data,int pos){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
        }
        Node curNode = head;
        int count =0;
        while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            count++;
        }
        if (curNode==null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    //Remove from Specific Position
    public void delpos(int pos){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node curNode = head;
        int count =0;
        while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            count++;
        }
        if (curNode == null || curNode.next == null) {
            System.out.println("Position out of bounds");
            return;
        }    
        curNode.next=curNode.next.next;
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data+"==>");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

public static void main(String[] args) {
    LL List = new LL();
    List.addFirst("Phani");
    List.addFirst("Hii");
    List.addLast("boo");
    List.printList();
    List.deleteLast();
    List.printList();
    List.addLast("How");
    List.printList();
    List.addpos("Hello", 2);
    List.printList();
    List.delpos(1);
    List.printList();
}
}