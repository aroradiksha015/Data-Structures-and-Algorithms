public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
    }
    
}
abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "dark brown";
        System.out.println(color);
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor Called");
    }
    void changeColor(){
        color="yellow";
        System.out.println(color);
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
} 