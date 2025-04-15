public class LL {
    Node Head;
    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //ADDFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (Head==null) {
            Head = newNode;
            return;
        }
        newNode.next=Head;
        Head = newNode;
    }
    //ADDLast
    public void addLast(String data){
        Node newNode = new Node(data);
        if (Head==null) {
            Head=newNode;
            return;
        }
        Node curNode=Head;
        while (curNode.next!=null) {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    //DeleteFirst
    public void deleteFirst(){
        if (Head==null) {
            System.out.print("List is empty");
            return;
        }
        Head=Head.next;
    }
    //DeleteLast
    public void deleteLast(){
        if (Head==null) {
            System.out.print("List is empty");
            return;
        }
        Node secondlast = Head;
        Node last = Head.next;
        while (last.next!=null) {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    //Addpos
    public void addpos(String data,int pos){
        Node newNode = new Node(data);
        if (Head==null) {
            Head=newNode;
            return;
        }
        Node curNode = Head;
        int count=0;
        while ((curNode!=null && count<pos-1)) {
            curNode=curNode.next;
            count++;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    //DeletePos

    public void delpos(int pos){
        if (Head==null) {
            System.out.println("List is empty");
            return;
        }
        if (pos ==0) {
            Head = Head.next;
            return;
        }
        Node curNode = Head;
        int count =0;
        while (curNode!=null && count<pos-1) {
            curNode=curNode.next;
            count++;
        }
        curNode.next=curNode.next.next;
    }
    
    //PrintList
    public void printList(){
        if (Head==null) {
            System.out.print("List is empty");
            return;
        }
        Node curNode = Head;
        while (curNode!=null) {
            System.out.print(curNode.data+" => ");
            curNode=curNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("Phani");
        list.addFirst("Hello");
        list.printList();
        list.addLast("jj");
        list.printList();
        list.deleteLast();
        list.printList();
        list.addpos("JK", 1);
        list.printList();
        list.delpos(1);
        list.printList();
    }
}