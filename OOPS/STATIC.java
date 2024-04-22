package OOPS;

class Students{
    String name;
    static String school;//gets fixed for all students

    public  static void changeSchool(){
        school="newschool";
    }
}
public class STATIC {
    public static  void  main(String []args){
        Students.school="JIET";// accessible by class name
        Students std=new Students();
        std.name="Tony";
        System.out.println(std.school);
    }
}
//STATIC:
//can be accessed using class name
//by using static we fixed school name for all students therefore it is easy to change this name for all students at once
//can be used for : properties, functions, blocks, nested classes
//static gets memory only once, therefore helpful to save memory.