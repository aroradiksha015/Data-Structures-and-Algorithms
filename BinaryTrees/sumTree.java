public class sumTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;  
        }
    }
        public static int SumTree(Node root){
            if(root==null){
                return 0;
            }
            int leftChild= SumTree(root.left);
            int righChild= SumTree(root.right);
            int data = root.data;
            int newLeft = root.left==null?0:root.left.data;
            int newRight = root.right==null?0:root.right.data;

            root.data = newLeft+leftChild+newRight+righChild;
            return data;
        }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        SumTree(root);
        preorder(root);

    }
    
}
