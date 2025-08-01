public class ArraySorted {
    public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
            return false;
        }
         return sorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,69,98,98};
        System.out.println(sorted(arr, 0));
    }
    
}
