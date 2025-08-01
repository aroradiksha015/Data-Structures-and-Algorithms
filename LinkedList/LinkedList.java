public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data ){
        //create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //new-node's next points to head
        newNode.next = head;

        //make newnode as head
        head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;//tail now points to new node
        //newnode's next=null
        tail=newNode;
    }

    public void print(){//O(n)
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i=i+1;
     
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }


    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data; //tail.data
        temp.next=null;
        size--;
        tail=temp;
        return val;
    }


    public int iterativeSearch(int key){
        Node temp=head;
        int idx=0;
        while(temp.next!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    //Recursive Search

    public int recursiveSearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = recursiveSearch(head.next, key);
        if(idx==-1){
            return -1;
        }
         return idx+1;
    }
    public int helper(int key){
       return  recursiveSearch(head, key);
    }


    public void reverse(){
        Node prev=null;
        Node curr=tail =head;
        while(curr!=null){
           Node next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        head=prev;
    }

    public void deleteNthFromEnd(int n){
        //calculate size;
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        Node prev = head;
        int i=0;
        int idx= size-n;
        while(i<idx){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //slow-fast concept
    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null|| head.next==null){
            return true;
        }
        //step1:find middle Node
        Node midNode= findMiddle(head);
        // step2 reverse the 2nd part
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //step3:check if my first part = 2nd part
        while(right.next!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
     
        ll.addMiddle(2, 1);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();



        // ll.print();

        // System.out.println(ll.iterativeSearch(3));

        // System.out.println(size);
    //    System.out.println( ll.helper(3));
    //    ll.reverse();
    // ll.deleteNthFromEnd(3);
       ll.print();
       //System.out.println(ll.findMiddle(head));
       System.out.println(ll.checkPalindrome());
    }
    
}
