public class BubbleSortd {
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]>arr[j]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        BubbleSort(arr);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }  
    }
}
