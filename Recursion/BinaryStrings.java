public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String Str){
        if(n==0){
            System.out.println(Str);
            return;
        }
        printBinStrings(n-1, 0, Str+"0");
        if(lastPlace==0
        ){
            printBinStrings(n-1, 1, Str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0, "");
        
    }
    
}
