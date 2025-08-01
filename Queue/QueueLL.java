public class QueueLL {
     static class Node{
         int data;
         Node next;
         Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    static class queue{
        static  Node head =null;
        static  Node tail=null;
    //isEmpty
    public static boolean isEmpty(){
        return head==null && tail==null;
    }
    //add
    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Cannot remove elements");
            return -1;
        }
        if(head==tail){
             int front= head.data;
             head=tail=null;
             return front;
        }
        int front=head.data;
        head=head.next;
        return front;
        
    } 
    //peek
    public static int peek(){
        return head.data;
    }
}
public static void main(String[] args) {
   queue.add(10);
   queue.add(20);
   queue.add(30);
   queue.add(40);
   System.out.println(queue.remove());
   System.out.println("x");
   while(!queue.isEmpty()){
    System.out.println(queue.peek());
    queue.remove();
   }

}
}
