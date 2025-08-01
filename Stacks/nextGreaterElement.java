import java.util.*;
public class nextGreaterElement {
//brute force
    public static void nextGreaterElement1(int arr[]){
        int gE[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    gE[i]=arr[j];
                    break;
                }else{
                    gE[i]=-1;
                }
            }
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(gE[i]+" ");
        }
    }
    public static void nextGreaterElement2(int arr[]){
         int gE[]=new int[arr.length];
          Stack<Integer>s=new Stack<>();
          for(int i=arr.length-1;i>=0;i--){
          while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
          }
          if(s.isEmpty()){
            gE[i]=-1;
          }
          else{
            gE[i]=arr[s.peek()];
          }
          s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(gE[i]+" ");
        }
        
    }
    public static void main(String[] args){
        int arr[]={6,8,0,1,3};
        nextGreaterElement2(arr);
       
        
    }
}
