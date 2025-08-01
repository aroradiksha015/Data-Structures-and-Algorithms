import java.util.*;
public class ReverseString {
    public static String ReverseString1(String str){
         Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
      }
      StringBuilder str1 = new StringBuilder("");
      while(!s.isEmpty()){
        char curr=s.pop();
        str1.append(curr);
      }
return str1.toString();

    }
    public static void main(String[] args) {
       String str = "Diksha";
       System.out.println(ReverseString1(str));


    }
}
