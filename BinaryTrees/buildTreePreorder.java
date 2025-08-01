import java.util.*;
public class buildTreePreorder{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class BinaryTree{
         static int idx=-1;
        static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right=BuildTree(nodes);
        return newNode;
        }
        //preOrder traversal //O(n)
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //InOrder
        public static void InOrder(Node root){//O(n)
            if(root==null){
                return;
            }
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);   
        }
        //PostOrder
        public static void PostOrder(Node root){//O(n)
            if(root==null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    //Level Order traversal 
    public  static void levelTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        //adding the root element in the queue
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode== null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    //Height of the Tree
    public static int height(Node root){//o(n)
        if(root==null){
            return 0;
        }
       int rl= height(root.left);
       int rr = height(root.right);
       return Math.max(rl, rr)+1;

    }
    //count of nodes
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int lcount= countNodes(root.left);
        int rCount = countNodes(root.right);
        return lcount+rCount+1;
    }
    //Sum of Nodes
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = Sum(root.left);
        int rightCount= Sum(root.right);
        return leftCount+rightCount+root.data;
    }
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldiam= Diameter(root.left);
        int Rdiam = Diameter(root.right);
        int lh=height(root.left);
        int rh = height(root.right);
        int selfDiam = lh+rh+1;
        return Math.max(selfDiam, Math.max(ldiam,Rdiam));
    }

    
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.BuildTree(nodes);
        System.out.println("Root:"+ root.data);
        // tree.preorder(root);
        //  tree.InOrder(root);
        // tree.PostOrder(root);
        // tree.levelTraversal(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.countNodes(root));
        // System.out.println(tree.Sum(root));
        System.out.println(tree.Diameter(root));
    }
}