//package HomeWork Problems;

public class printDigits {
     static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int number){
        if(number==0){
            return;
        }
        int digit= number%10;

        printDigit(number/10);
        System.out.print(digits[digit]+" ");

    }
    public static void main(String[] args) {
        int number = 1947;
        printDigit(number);
    }
}
