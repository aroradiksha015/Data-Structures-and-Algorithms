import java.util.*;
public class KthLevel {
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
    public static void KLevel(Node root, int k){
        if(root==null){
            return;
        }
        Queue<Node>q= new LinkedList<>();

        int level=1;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                level++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(level==k){
                    System.out.print(currNode.data+" ");
                }
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                 if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
            }
        }
        //Recursively 
        public static void kLevel1(Node root,int level, int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            kLevel1(root.left, level+1, k);
            kLevel1(root.right, level+1, k);
        }
    

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // KLevel(root,3);
        kLevel1(root, 1, 3);

    }
    
}
