public class firstOccurrence {
    public static int firstO(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstO(arr, i+1, key);
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,69,98,98,20,10,5};
        System.out.println(firstO(arr, 0, 20));
        
    }
    
}
