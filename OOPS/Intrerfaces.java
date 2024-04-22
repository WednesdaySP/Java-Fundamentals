package OOPS;

interface Food{//cannot have non-abstract functions
    int quantity=10;//fixed, same for all foods
    void tasty();//by default, it is abstract/public

}

interface Veges {

}
class Puri implements Food, Veges{

    public void tasty() {
        System.out.println("Masala puri or Aloo puri🤤");
    }
}

public class Intrerfaces {
    public  static  void  main(String[]args){
        Puri pr=new Puri();
        pr.tasty();

    }
}
//interfaces: pure abstraction
//all fields are public, static and final by default
//all methods are public and abstract by default
// a class that implements an interface must implement all the methods declared in the interface
//interfaces support functionality of multiple inheritance by using implements

