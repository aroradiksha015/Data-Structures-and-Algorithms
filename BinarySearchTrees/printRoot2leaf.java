import java.util.ArrayList;

public class printRoot2leaf {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    
    public static void printroot2Leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            PrintPath(path);
        }
        
        printroot2Leaf(root.left, path);
        printroot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void PrintPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
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

        printroot2Leaf(root, new ArrayList<>());
    }
    
}
