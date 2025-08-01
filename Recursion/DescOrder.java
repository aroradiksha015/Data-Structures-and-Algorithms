public class DescOrder {
    public static int descorder(int n){
        if(n==1){
            return 1;
        }else{
           return n+ descorder(n-1);
        }
    }
    public static void descorder1(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }else{
            System.out.print(n+" ");
            descorder1(n-1);
        }
    }
    public static void main(String[] args) {
        int n=10;
       System.out.println(descorder(n));
       descorder1(n);
    }
    

}
