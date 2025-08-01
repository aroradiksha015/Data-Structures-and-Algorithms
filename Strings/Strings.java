// import java.util.*;
public class Strings{
    public static void main(String args[]){
        // char[]arr={'a','b','c','d'};
        // String str="abcd";
        // String str2 = new String("xyz");
        // Scanner sc= new Scanner(System.in);
        // String name = sc.next();
        //  System.out.println(name);
       // String fullName = sc.nextLine();
        //System.out.println(fullName.length());
        // String name="Diksha";
        // String lname ="Arora";

        // String fullName1= name+" "+ lname;

        
        // System.out.println(fullName1);
        
        // //charAt Method
        // for(int i=0;i<fullName1.length();i++){
        //     System.out.println(fullName1.charAt(i));
        // }
        String s1="Tony";
        String s2="Tony";

        String s3 = new String("Tony");


        if(s1==s2){
            System.out.println("Strings: s1 and s2 are equals");
        }
         if(s1==s3){
            System.out.println("String s1 and s3 are equals");
        }

        if(s1.equals(s2)){
            System.out.println("Strings: s1 and s2 are equals");
        }
         if(s1.equals(s3)){
            System.out.println("String s1 and s3 are equals");
        }

        //Strings are immutable
    }
}