public class Fibo {
    public static int fibonnacci(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibonnacci(n-1)+fibonnacci(n-2);
        }
    }
    public static void main(String[] args) {
        //int n = 100;
        //System.out.println(fibonnacci(5));
        for(int i=0;i<10;i++){
        System.out.print(fibonnacci(i)+" ");}
    }
}
    

