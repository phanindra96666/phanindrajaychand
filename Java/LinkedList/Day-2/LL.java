class LL {
    Node head;
    static class Node { 
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
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public void addpos(int data, int pos){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node newNode = new Node(data);
        Node curNode = head;
        int count = 0;
        while (curNode != null && count < pos - 1) {
            curNode = curNode.next;
            count++;
        }
        if (curNode == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
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
        Node newCurnode = head.next;
        while (curNode != null && count < pos - 1) {
            curNode = curNode.next;
            newCurnode = newCurnode.next;
            count++;
        }
        if (curNode == null || newCurnode == null) {
            System.out.println("Position out of bounds");
            return;
        }
        curNode.next = newCurnode.next;       
    }

    public Node ReverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = ReverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public void ReverseIterate(){
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node curNode = head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode; 
            prevNode = curNode;
            curNode = nextNode;
        }
        head = prevNode;
    }

    public void getMiddle (){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curnode = head;
        Node curNext = head.next;
        while (curNext != null && curNext.next != null) {
            curnode = curnode.next;
            curNext = curNext.next.next;
        }
        System.out.println(curnode.data);
    }

    public void kth(int n){
        Node curNode = head;
        int len = 0;
        while (curNode != null) {
            curNode = curNode.next;
            len++;
        }
        int res = len - n;
        if (res < 0 || res >= len) {
            System.out.println("Invalid value of n");
            return;
        }
        int result = 0;
        Node curnode = head;
        while (res != result) {
            result++;
            curnode = curnode.next;
        }
        System.out.println(curnode.data);
    }

    public void removeDublicate() {
        if (head == null) {
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            if (curNode.data == curNode.next.data) {
                curNode.next = curNode.next.next;
            }
            else {
                curNode = curNode.next;
            }
        }
    }

    public void kth_beg_end(int n){
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (n > len) {
            return;
        }
        Node first = head;
        for (int i = 1; i < n; i++) {
            first = first.next;
        }
        Node second = head;
        for (int i = 1; i < len - n + 1 ; i++) {
            second = second.next;
        }
        if (first != second) {
            int tempData = first.data;
            first.data = second.data;
            second.data = tempData;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node addNumbers(Node num1, Node num2){
        Node res = null;
        Node curr = null;
        int carry = 0;
        num1 = reverse(num1);
        num2 = reverse(num2);
        while (num1 != null || num2 != null || carry != 0){
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            if (res == null) {
                res = newNode;
                curr = newNode;
            } else {
                curr.next = newNode;
                curr = curr.next;
            }
        }
        return reverse(res);
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "==>");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "=>");
            curr = curr.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        LL List = new LL();//constructor calling
        List.addFirst(5);
        List.addFirst(10);
        List.addFirst(8);
        List.addFirst(5);
        List.addFirst(9);
        List.addFirst(3);
        List.printList();
        //List.removeDublicate();
        //List.printList();
        //List.ReverseIterate();
        //List.printList();
        // List.getMiddle();
        // List.kth(3);
        // List.kth_beg_end(2);
        List.ReverseIterate();
        List.printList(); 
        //for add two numbers
        // Node num1 = new LL.Node(1); 
        // num1.next = new LL.Node(2);
        // num1.next.next = new LL.Node(3);

        // Node num2 = new LL.Node(9);
        // num2.next = new LL.Node(9);
        // num2.next.next = new LL.Node(9);

        // Node sum = addNumbers(num1, num2);
        // List.printlist(sum);
    }
}