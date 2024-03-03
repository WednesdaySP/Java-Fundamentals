import java.util.*;
public class StrBuilder {

    //heap k ander object create hote h or stack k ander normal variables create hote h
    //StringBuilder is more optimized than string

    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);

        //for string "Tony"

        //chatAt(): to get char at that index
//        System.out.println(sb.charAt(0));

        //setCharAt(): to set a char at index
//        sb.setCharAt(0,'P');
//        System.out.println(sb);

        //insert(): insert char at some index
//        sb.insert(0,"S");
//        System.out.println(sb);
//
//        sb.insert(3,'n');
//        System.out.println(sb);

        //delete extra 'n'
        //ending index is non-inclusive i.e. if index is 3 it will count till 2
//
//        sb.delete(0,2);
//        System.out.println(sb);
//
//        sb.insert(0,"T");
//        System.out.println(sb);
//
//        sb.delete(2,4);
//        System.out.println(sb);

        //for string "hello"

        //append(): Append means to add something at the end.
//        sb.append('e');  //for string: str = str + "e";
//        System.out.println(sb);
//        sb.append('l');
//        sb.append('l');
//        sb.append('o');
//        System.out.println(sb);
//        System.out.println(sb.length());

        //reverse string
        //time complexity: O(n)

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i; //for h:5-1-0 i.e. 4, so h will go to 4th index

            char frontChr=sb.charAt(front);
            char backChr=sb.charAt(back);

            sb.setCharAt(front,backChr);
            sb.setCharAt(back,frontChr);
        }
        System.out.println(sb);


        }
}
