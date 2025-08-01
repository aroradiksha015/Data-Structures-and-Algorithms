import java.util.ArrayList;

public class stackA{

    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty() == true){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top; 
        }
        //peek 
        public static int peek(){
            if(isEmpty() == true){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args){

        stack b = new stack();

        b.push(1);
        b.push(2);
        b.push(3);

        while(!b.isEmpty()){
            System.out.println(b.peek());
            b.pop();


        }

    }
}