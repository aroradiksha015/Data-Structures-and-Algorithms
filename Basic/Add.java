import java.util.*;
public class Add {
    public static int add(int x,int y){//parameters or formal parameters
        int a=x;
        int b=y;
        return(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter first number:");
        x=sc.nextInt();
        System.out.println("Enter Second number:");
        y=sc.nextInt();
        int result=add(x, y);//actual parameters or arguments
        System.out.println("The result of two numbers="+result);
        sc.close();
    }
    
}
