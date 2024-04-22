package OOPS;

 class Pen {
    String color;
    String type;

    void write(){
        System.out.println("Writing something");
        System.out.println(this.color);
        System.out.println(this.type);
    }

}
class  Student{
     String name;
     int age;

     public void printInfo(){
         System.out.println(this.name);
         System.out.println(this.age);
     }

//     Student(String name, int age){
//         System.out.println("Constructor called");
//         this.name=name;
//         this.age=age;
//     }

     //copy constructor
     Student(Student s2){
         System.out.println("Copy Constructor");
         this.name=s2.name;
         this.age=s2.age;
     }
     Student(){

     }
}

 public class OOPs{
     public static void main(String []args){
         Pen pen1=new Pen();//object
         pen1.color="red";
         pen1.type="gel";
         pen1.write();

         Pen pen2=new Pen();
         pen2.color="purple";
         pen2.type="ball pen";
         pen2.write();

//         Student std = new Student("Prabha",21);
//         std.name="Shashi";
//         std.age=20;
         Student s1=new Student();
         s1.name="SP";
         s1.age=22;
         s1.printInfo();

         Student s2=new Student(s1);
         s2.printInfo();

     }
     //java has automatic garbage collector or destructor
     //therefore we don't make Destructor in java

}