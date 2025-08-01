public class OOPS{
    public static void main(String args[]){
      Pen p1 = new Pen();
      p1.setColor("Orange");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("yellow");
    System.out.println(p1.getColor());
    // BankAccount myAcc= new BankAccount();
    // myAcc.username= "DikshaArora";
    // // myAcc.password="123";
    // System.out.println(myAcc.username);
    // // System.out.println(myAcc.password);
    // myAcc.changePassword("123");
    }
}
class Pen{
   private String color;
   private int tip;

    void setColor( String color)
    {
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    int getTip(){
        return this.tip;
    }

    String getColor(){
        return this.color;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage = (phy+chem+maths)/3;
    }
}
class BankAccount{
    public String username;
    private String password;

    void changePassword(String newPass){
        password=newPass;
        System.err.println(password);
    }
}
