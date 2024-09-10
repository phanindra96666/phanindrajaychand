public class first {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    
    public static Node insert(Node root,int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean Search(Node root,int key ){
    if (root == null) {
        return false;
    }
    if (root.data>key) {
        return Search(root.left, key);
    }
    else if (root.data == key) {
        return true;
    }
    else{
        return Search(root.right, key);
    }  
    }

    public static void printInrange(Node root , int x,int y){
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInrange(root.left, x, y);
            System.out.print(root.data);
            printInrange(root.right, x, y);
        }

        else if (root.data >= y) {
            printInrange(root.left, x, y);
        }
        else{
            printInrange(root.right, x, y);
        }
    }
    
    public static void main(String[] args) {
        int values [] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        // inOrder(root);
        // System.out.println();
        if (Search(root, 1)) {
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        printInrange(root, 1, 3);
    }
}