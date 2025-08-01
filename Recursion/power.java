public class power {
    public static int power1(int x, int n){
        if(n==0){
            return 1;
        }
        return x* power1(x,n-1);
    }
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowerSq = halfpower* halfpower;
        if(n%2!=0){
            halfpowerSq= halfpowerSq*x;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        //System.out.println(power1(2, 0));
        System.out.println(optimizedPower(3, 7));
    }
    
}
