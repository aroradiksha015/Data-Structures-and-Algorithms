public class methodOverriding {
    public static void main(String[] args) {
       Deer obj = new Deer();
       obj.eat(); 
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}