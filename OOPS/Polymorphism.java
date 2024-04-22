package OOPS;

 class OOp {

    String word;
    int value;

    public void display(String word){
        System.out.println(this.word);
    }
    public void display(int value){
        System.out.println(this.value);
    }
    public  void display(String word,int value){
        System.out.println(word +" "+ value);
    }


}
public class Polymorphism{
    public static  void  main(String []args){
        OOp pm=new OOp();
        pm.word="Java";
        pm.value=5;
        pm.display(pm.value);
        pm.display(pm.word);
        pm.display(pm.word,pm.value);
    }
}
//methods with same name: method overloading
//compile polymorphism:error while compiling
//run time polymorphism:error while running the code