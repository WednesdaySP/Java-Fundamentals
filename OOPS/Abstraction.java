package OOPS;

//abstract: a imaginary concept,  cannot be used actually
abstract class  Animal{

    Animal(){
        System.out.println("You are creating a new animal");
    }
    abstract void walk();
    public  void eat(){
        System.out.println("Animals eat");
    }
}

class Horse extends Animal{
    //constructor chaining: when using inheritance
    //first the base class constructor will run then child class constructor will run
    Horse(){
        System.out.println("Created a Horse");
    }

    public void walk() {

        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {

    public  static  void  main(String[]args){

        Horse horse=new Horse();
        horse.walk();
        horse.eat();

//        Animal animal=new Animal();
//        animal.walk(); //will give error: cannot instantiate the type animal

    }
}

//abstract must be created using abstract keyword
//can have abstract and non-abstract methods
//cannot be instantiated
//can have constructor and static methods also
//can have final methods which will force the subclass not to change the body of the method



