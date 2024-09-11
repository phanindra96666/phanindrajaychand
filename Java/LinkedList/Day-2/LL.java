public class LL {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
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
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next=null;
    }

    public void addpos(int data,int pos){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        Node curNode = head;
        int count = 0;
        while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            count++;
        }
        newNode.next=curNode.next;
        curNode.next = newNode;
    }

    //Remove from Specific Position
    public void delpos(int pos){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
       Node curNode = head;
       int count=0;
       Node newCurnode = head.next;
       while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            newCurnode=newCurnode.next;
            count++;
       }
       curNode.next = newCurnode.next;       
    }

    //Reverse 
        public Node ReverseRecursive(Node head){
            if (head==null || head.next==null) {
                return head;
            }
            Node newNode = ReverseRecursive(head.next);
            head.next.next=head;
            head.next=null;

            return newNode;
        }

    public void ReverseIterate(){
        if (head==null || head.next==null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode!=null) {
            Node nextNode = curNode.next;
            curNode.next=prevNode; // unlink the next node after curNode to pervNode
            //update
            prevNode = curNode; // form currNode to null make the linkedlist to name as pervNode
            curNode=nextNode; // make the nextNode to curNode
        }
         head.next = null;
         head = prevNode;
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
    List.addFirst(5);
    List.addFirst(4);
    List.addFirst(3);
    List.addFirst(2);
    List.addFirst(1);
    List.printList();
    List.ReverseIterate();
    List.printList();
}
}
