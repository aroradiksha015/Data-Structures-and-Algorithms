public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Diksha";
        s1.roll=456;
        s1.password="123";

        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=88;

        Student s3 = new Student(s1);
        s3.password="xyz";

        Student s2= new Student("Diksha",123);
        System.out.println(s2.name+" "+s2.roll);
        s1.marks[2]=100;
        for(int i=0;i<s3.marks.length;i++){
          System.out.println(s3.marks[i]);
        }
    }
}
    class Student{
        String name;
        int roll;
        String password;
        int marks[];
        //shallow copy constructor 
        // Student(Student s1){
        //     marks= new int[3];
        //     this.name = s1.name;
        //     this.roll= s1.roll;
        //     this.marks=s1.marks;
        // }


        //deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll= s1.roll;
            for(int i=0;i<marks.length;i++){
                this.marks[i]=s1.marks[i];
            }

        }
        Student(){
            marks= new int[3];
            System.out.println("Constructor is called");
        }

        Student(String name,int roll){
            marks= new int[3];
            System.out.println("constructor is called");
            this.name=name;
            this.roll=roll;
        }

    }
    

