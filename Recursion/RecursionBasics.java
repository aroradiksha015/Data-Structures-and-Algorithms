public class RecursionBasics{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn = n * factorial(n-1);
        return fn;
    }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int sum = Sum(n-1)+n;
        return sum;
    }
    public static int printFibonacci(int n)
    {
        if(n==0||n==1){
            return n ;
        }
        int f1= printFibonacci(n-1);
        int f2  = printFibonacci(n-2);
        int fn = f1+f2;
        return fn;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstO(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstO(arr, i+1, key);
    }
    public static int lastO(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastO(arr, i+1, key);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x* power(x, n-1) ;
    }
    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowerSq= halfpower*halfpower;

        //n is odd 
        if(n%2!=0){
        halfpowerSq = x* halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(optimizedPower(x, n));
        // System.out.println(power(x, n));
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(7));
        // System.out.println(Sum(2));
        // int arr[]={1,2,3,9,5,9,0,8,7,4};
        // System.out.println(isSorted(arr, 0));
        // int key=9;
        // System.out.println(firstO(arr, 0, key));
        // System.out.println(lastO(arr, 0, key));
        // for(int i =0;i<10;i++){
        //     System.out.println(printFibonacci(i)+" ");
        // }
    }
}