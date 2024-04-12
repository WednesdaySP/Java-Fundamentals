
package LinkedList;
import java.util.*;

public class LL2 {
    public static void main(String[]args){
        LinkedList<String> list=new LinkedList<String>();
        //add
        list.addFirst("is");
        list.addFirst("Man");
        System.out.println(list);

        list.add("a");
        list.addLast("portrait");
        list.addLast("of");
        list.addLast("emotions");
        System.out.println(list);

        //size
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i)+"->");
        }
        System.out.println("null");

        //delete or remove
        list.removeLast();
        list.removeLast();
        System.out.println(list);




    }
}
