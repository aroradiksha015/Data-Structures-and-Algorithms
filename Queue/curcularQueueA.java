public class curcularQueueA {
    // import java.util.Queue;
    static class queue{
         static int arr[];
         static int size;
         static int rear;
         static int front;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        //isEmpty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //isFull
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Cannot add elements");
                return;
            }
            if(front==-1){
                front=0;
            }
                rear=(rear+1)%size;
                arr[rear]=data;
            }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("cannot remove elements");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=rear=-1;
             }else{
                front=(front+1)%size;
             }
             
             
             //last el
             
             return result;
        }
        public static int peek(){
            return arr[front];
        }
    }
    public static void main(String args[]){
        queue q= new queue(3); 

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        queue.add(4);
       System.out.println(queue.remove());
       queue.add(5);



        // System.out.println(queue.size);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
        // System.out.println(queue.size);


    }
}
    

