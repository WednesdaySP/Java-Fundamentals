package Stack;

import java.util.Stack;

public class BottomOfStack {
    //upwards:remove
    //downward:push
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(data,s);
        s.push(top);



    }

    public static void main(String[]args){
        Stack<Integer> s=new Stack<>();

        s.push(2);
        s.push(5);
        s.push(4);
        s.push(9);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
