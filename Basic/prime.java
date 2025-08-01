public class prime {
    public static void main(String args[])
    {
        int num=13;
        for(int i=2;i<num-1;i++)
        {
            if(num%i==0)
            {
                System.out.println("not prime");
                return;
            }
            
        }
        System.out.println("prime");
    }
    
}
