package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static  void main(String[]args){
       ArrayList<Integer> list =new ArrayList<Integer>();

       //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element1=list.get(0);
        System.out.println(element1);

        //add elem in btw
        list.add(1,5);
        System.out.println(list);

        //set elm
        list.set(0,9);
        System.out.println(list);

        //remove elm
        list.remove(3);
        System.out.println(list);

        //size of list
        int size=list.size();
        System.out.println(size);


        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        //we will use Collection class's sort method to sort ArrayList
        Collections.sort(list);
        System.out.println(list);

        //reversing list
        Collections.reverse(list);
        System.out.println(list);



    }
}
