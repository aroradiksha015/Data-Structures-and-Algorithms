public class deleteNode {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node findSuccessor(Node root){
        while(root.left!=null){
           root =  findSuccessor(root.left);
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left= delete(root.left,val);
        }else if(root.data<val){
            root.right=delete(root.right,val);
        }else{
            //voila
        if(root.left==null&&root.right==null){
            return null;
        }
         }
         //one child
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        //both child
        else{
            Node IS= findSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
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
        Node root = new Node(8);
        root.left=new Node(5);
        root.left.left= new Node(3);
        root.left.right = new Node(6);
        root.left.left.left= new Node(1);
        root.left.left.right= new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
   
        Node head = delete(root, 10);
        
        inOrder(head);

        }



}  
