public class methodOverloading {
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        System.out.println(obj.sum(4,5));
        System.out.println(obj.sum(4.4f,5.9f));
        System.out.println(obj.sum(10,20,30));
        
    }
    
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}
