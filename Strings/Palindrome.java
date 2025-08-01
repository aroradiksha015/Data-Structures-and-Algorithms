import java.util.*;
public class Palindrome {
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println("String is palindrome:"+ checkPalindrome(str));
        sc.close();
    }
    
}
