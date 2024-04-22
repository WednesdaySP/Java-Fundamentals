package OOPS;


class Shape{
    String color;
    public  void area(int r){
        System.out.println("display area");
    }

}

class  Triangle extends Shape{ // single inheritance

    public  void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{//hierarchical inheritance


    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
class  EquTriangle extends  Triangle{//multiple inheritance
    public  void  area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class Inheritance {

    public static void main (String args[] ){
        Triangle t1=new Triangle();
        t1.area(5);
        t1.area(4,3);




    }
}
//improves re-usability
//4 types of inheritance in java. 5 in C++
//single inheritance
//multiple inheritance
//hierarchical inheritance
//hybrid inheritance: all type of inheritance are available together

//multiple inheritance: used in java by interference

