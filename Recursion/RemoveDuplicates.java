public class RemoveDuplicates {
    public static String duplicateString(String str,int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            return newStr.toString();
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
             return duplicateString(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
                return duplicateString(str, idx+1, newStr.append(currChar), map);
            }
        }

    
    public static void main(String[] args)
    {
        String str="bcabc";
        System.out.println(duplicateString(str, 0, new StringBuilder(""), new  boolean[26]));
    }
    
}
                        