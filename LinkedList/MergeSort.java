public class MergeSort {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergedLL= new Node(-1);
        Node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
             head2=head2.next;
             temp=temp.next;

        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //divide the linked list
        Node midNode = findMid(head);

        //left half sort && right half sort
        Node RightHead= midNode.next;
        midNode.next=null;
        Node LeftHead= head;
        //merge the two parts
        Node head1= mergeSort(LeftHead);
        Node head2= mergeSort(RightHead);
        return merge(head1,head2);
    }
    public static void main(String[] args) {
        MergeSort ll=new MergeSort();
        Node head=new Node(5);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);

        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
       }
       System.out.println("null");

       Node temp1=ll.mergeSort(head);
       while(temp1!=null){
        System.out.print(temp1.data+"->");
        temp1 = temp1.next;
       }
       System.out.println("null");


        
    }
    
}
