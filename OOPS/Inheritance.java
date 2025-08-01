public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();
        // shark.swim();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs= 4;
        // System.out.println(dobby.legs);
        Bird pigeon = new Bird();
        pigeon.eat();

    }
    
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammals can walk");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Bird can fly");
    }

}
// class Dog extends Mammal{
//     int breed;
// }
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
