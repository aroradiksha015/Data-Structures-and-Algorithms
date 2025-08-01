// import java.util.Queue;

public class queueA{
    static class queue{
         static int arr[];
         static int size;
         static int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        //isEmpty
        public static boolean isEmpty(){
            return rear==-1;
        }
        //add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Cannot add elements");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(rear==-1){
                System.out.println("cannot remove elements");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            return arr[0];
        }
    }
    public static void main(String args[]){
        queue q= new queue(5); 

        queue.add(1);
        queue.add(2);
        queue.add(3);

        // System.out.println(queue.size);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
        queue.add(100);
        queue.add(200);

        queue.remove();

        // System.out.println(queue.size);


        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }


    }
}