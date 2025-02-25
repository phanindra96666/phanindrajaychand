import java.util.*;
public class first {
    public static class Node { //innerClass
        int data;
        Node left;
        Node right;

        Node(int data){  //constructer
            this.data=data;
            left=null;
            right=null;
        }
    }

    static class BinaryTree { //innerClass
        static int idx=-1;//not inside initialize becouse of call recursive
        public static Node buildTree(int nodes[]) { //Method
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

        public static void perOrder(Node root){ //innerClass
            if (root == null) {
                return;
            }
            System.out.print(root.data+" "); 
            perOrder(root.left);
            perOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null) {
                return;          
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void PostOrder(Node root){
            if (root == null) {
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if (root==null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode==null) {    
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curNode.data+" ");
                    if (curNode.left!=null) {
                    q.add(curNode.left);
                    }
                    if (curNode.right!=null) {
                        q.add(curNode.right);
                    } 
                }
            }
        }
        public static int countOfNodes(Node root){
            if (root==null) {
                return 0;
            }
            int leftNode = countOfNodes(root.left);
            int rightNode = countOfNodes(root.right);
            return leftNode + rightNode + 1; // root.data will give sum of Nodes insted of 1
        }

        public static int height (Node root){
            if (root==null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int myHeight = Math.max(leftHeight, rightHeight)+1;
            return myHeight;
        }

        public static int diameter(Node root){
            if (root==null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = (height(root.left) + height(root.right)+1);
            return Math.max(diam3 , Math.max(diam1, diam2));
        }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();//object
        Node root = tree.buildTree(nodes);//goes one by one.
        // perOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // PostOrder(root);
        // System.out.println();
        // levelOrder(root);
        System.out.println(countOfNodes(root));
        // System.out.println(height(root));
        //System.out.println(diameter(root));
    }
} 