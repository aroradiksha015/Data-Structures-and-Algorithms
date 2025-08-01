import java.util.*;
public class Product {
    // public static int multiply(int a , int b){
    //     int product = a*b;
    //     return product;
    // }
    public static int Factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static int binCoeff(int n,int r){
      int n_fact = Factorial(n);
      int r_fact = Factorial(r);
      int nmr_fact = Factorial(n-r);
      int binCoeff = n_fact/(r_fact*nmr_fact);
      return binCoeff; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // int x,y;
        // // System.out.println("Enter two values to multiply");
        // // x=sc.nextInt();
        // // y=sc.nextInt();
        // // int result=multiply(x,y);
        // // System.out.println("The result is:"+result);
        // System.out.println("Enter a number");
        // int num=sc.nextInt();
        //  int result=Factorial(num);
        // System.out.println("The result is:"+result);
      System.out.println(binCoeff(5,2));
        

      sc.close();
    }
}