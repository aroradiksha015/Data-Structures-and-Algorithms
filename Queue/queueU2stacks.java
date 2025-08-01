import java.util.*;
public class queueU2stacks {
    // public class Queue{
    //      static Stack<Integer>s1 =new Stack<>();
    //      static Stack<Integer>s2 = new Stack<>();

    //      public static boolean isEmpty(){
    //         return s1.isEmpty();
    //      }
    //      //add
    //      public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);

    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //      }
    //      //remove
    //      public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("cannot remove elements");
    //             return -1;
    //         }
    //         return s1.pop();
    //      }
    //      //peek
    //      public static int peek(){
    //         return s1.peek();
    //      }
    //     }
    
    // public static void main(String[] args) {
    //     // queueU2stacks q = new queueU2stacks();
    //     Queue.add(1);
    //     Queue.add(2);
    //     Queue.add(3);
    //     while(!Queue.isEmpty()){
    //         System.out.println(Queue.peek());
    //         Queue.remove();
    //     }
    // }
    public static class Queue{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();
        public static boolean isEmpty(){
            return  s1.isEmpty() && s2.isEmpty();
        }
        //add
        public static void add(int data){
            s1.push(data);
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            }
            return s2.pop();
        
        }
          public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }
    }
        
    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        // System.out.println(Queue.remove());
        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
        
    }
    
}
