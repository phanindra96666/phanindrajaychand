public class third {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right  = null;
        }
    }
    
    public static class BinaryTree {
        static int idx=-1;
        public Node builtree(int [] nodes){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtree(nodes);
            newNode.right = builtree(nodes);
            return newNode;
        }
    }
    public static void perOrder(Node root){
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
    public static void postOrder(Node root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return leftNode+rightNode+1;
    }

    public static void main(String[] args) {
        int [] nodes =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node node = tree.builtree(nodes);
        System.out.print("preOrder:");
        perOrder(node);
        System.out.println();
        System.out.print("inOrder:");
        inOrder(node);
        System.out.println();
        System.out.print("postOrder:");
        postOrder(node);
        System.out.println();
        System.out.println(countOfNodes(node));
    }
}