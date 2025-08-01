import java.util.*; 
public class Diameter {
    static class Node{
        char data;
        Node next;
        Node left;
        Node right;
        public Node(char data){
            this.data = data;
            this.next = null;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int Diam;
        int ht;
        Info(int Diam , int ht){
            this.Diam = Diam;
            this.ht= ht;
        }
    }
    static Info Diameter(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int Diam = Math.max(Math.max(leftInfo.Diam, rightInfo.Diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(Diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.right.left = new Node('D');
        root.right.right = new Node('E');

       System.out.println(Diameter(root).Diam);
        System.out.println(Diameter(root).ht);

    }
    
}
