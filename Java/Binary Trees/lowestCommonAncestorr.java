import java.util.Scanner;

public class lowestCommonAncestorr {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null; 
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static Node lca(Node root , int n1 , int n2){
        if (root == null) {
            return null;
        }
        if (root.data<n1 && root.data<n2) {
            return lca(root.right, n1, n2);
        }
        else if (root.data>n1 && root.data>n2) {
            return lca(root.left, n1, n2);
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the nodes in the tree (use -1 for null):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] nodes = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nodes[i] = Integer.parseInt(inputArray[i]);
        }

        // Build the tree
        Node root = BinaryTree.buildTree(nodes);

        System.out.print("Enter the first number for LCA: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number for LCA: ");
        int n2 = scanner.nextInt();

        // Find LCA
        Node lcaNode = lca(root, n1, n2);
        if (lcaNode != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("LCA not found.");
        }

        scanner.close();
    }
}

