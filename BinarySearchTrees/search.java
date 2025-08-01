import javax.naming.directory.SearchResult;

public class search {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return Search(root.left, key);
        }else{
            return Search(root.right,key);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left=new Node(5);
        root.left.left= new Node(3);
        root.left.right = new Node(6);
        root.left.left.left= new Node(1);
        root.left.left.right= new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        // inOrder(root);
        System.out.println(Search(root, 2));

    
        
    }
    
}
