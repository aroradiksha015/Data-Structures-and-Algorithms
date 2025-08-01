public class MultipleInheritance {
    public static void main(String args[])
    {
    Bear b = new Bear();
    b.eatanimal();
    b.eatgrass();
    }
}
interface Herbivore{
    void eatgrass();
}
interface Carnivore{
    void eatanimal();
}
class Bear implements Herbivore , Carnivore{
    public void eatgrass(){
        System.out.println("Bear eats Grass");
    }
    public void eatanimal(){
        System.out.println("bear eats Animals");
    }
}
