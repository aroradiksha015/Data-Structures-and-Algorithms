public class zigzagll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void reverse(Node head){
        Node mid= findMid(head);
        Node curr = mid.next;
        mid.next=null;

        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right=prev;
        Node nextL, nextR;
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;

        }


    }
    public static void main(String[] args) {
        // zigzagll ll = new zigzagll();
        Node head=new Node(5);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
         head.next.next.next.next=new Node(1);

        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
       }
       System.out.println("null");
       reverse(head);
       Node temp1=head;

        while(temp1!=null){
        System.out.print(temp1.data+"->");
        temp1 = temp1.next;
       }
       System.out.println("null");
    }
    
}
