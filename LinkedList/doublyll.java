public class doublyll {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
           this.prev=null;
        this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head.next.prev=null;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }
        head=prev;;
    }
    public static void main(String[] args) {
        doublyll ll= new doublyll();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2); 
        ll.addLast(10);
        ll.print();
          System.out.println(size);
        // ll.removeFirst();
    

        ll.print();
          System.out.println(size);

        //   ll.removeLast();
          ll.print();
          System.out.println(size);
          ll.reverse();
          ll.print();
      
        
    }
    
}
