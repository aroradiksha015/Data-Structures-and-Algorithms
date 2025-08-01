import java.util.*;
public class AreaCircle {
    public static void main(String args[])
    {
        int r;
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        float area= 3.14f*r*r;
        System.out.println("The area of the circle is"+area);
        sc.close();

    }
}
