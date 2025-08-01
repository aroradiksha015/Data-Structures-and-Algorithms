import java.util.ArrayList;

public class heaps {
    static class heap{
        ArrayList<Integer>arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int parent = (x-1)/2;

            while(arr.get(parent)> arr.get(x)){
                // swap
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent, temp);

                x=parent;
                parent = (x-1)/2;
            }
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right= 2*i+2;
            int minIdx = i;

            while(left<arr.size()&& arr.get(minIdx)>arr.get(left)){
                minIdx = left;
            }
            if(right<arr.size()&& arr.get(minIdx)>arr.get(right)){
                minIdx = right;
            }

            if(minIdx!=i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }


        }
        public int remove(){
            int data = arr.get(0);

            //swap last index and first index
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);
            
            heapify(0);
            return data;
        }
        public int peek(){
            if(isEmpty()){
                System.out.print("Heap is Empty");
            }
            return arr.get(0);
        } 
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
      heap x = new heap();
      x.add(3);
      x.add(4);
      x.add(1);
      x.add(5);
      x.add(0);

    //   x.show();

    while(!x.isEmpty()){
        System.out.print(x.peek()+" ");
        x.remove();

    }
    }
    
}
