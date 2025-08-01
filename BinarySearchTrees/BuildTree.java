public class BuildTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node Buildtree(Node root , int n){
        if(root==null){
            root = new Node(n);
            return root;
        }
        if(root.data>n){
            root.left = Buildtree(root.left,n);
        }else{
        // if(root.data<n){
            root.right = Buildtree(root.right,n);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root = Buildtree(root,values[i]);
        }
        inOrder(root);
    }
}