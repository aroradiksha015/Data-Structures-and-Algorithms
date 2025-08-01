//package HomeWork Problems;

public class length {
    public static int  StringLength(String str){
        if(str.length()==0){
            return 0;
        }
        return StringLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(StringLength(str));
    }
    
}
