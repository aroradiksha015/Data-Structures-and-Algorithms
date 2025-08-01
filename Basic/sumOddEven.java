import java.util.*;
public class sumOddEven {
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the last integer");
       int n= sc.nextInt(); 
       int sumOdd = 0;
       int sumEven=0;
       for(int i=1;i<=n;i++){
       if(i%2==0){
        sumEven+=i;
       }
       else{
        sumOdd+=i;
       }
    }
       System.out.println("Sum of Odd Numbers="+sumOdd);
       System.out.println("Sum of Even Numbers="+sumEven);
       sc.close();
    
}

    
    
}
