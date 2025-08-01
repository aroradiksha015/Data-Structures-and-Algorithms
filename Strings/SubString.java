public class SubString {
    public static String subString(String Str, int si, int ei){
        String Nstr="";
        for(int i=si;i<ei;i++){
            Nstr+=Str.charAt(i);
        }
        return Nstr;
    }
    public static void main(String[] args) {
        String Str="HelloWorld";
        //System.out.println(subString(Str, 2, 5));
        System.out.println(Str.substring(0,5));
    }
}
