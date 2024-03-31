package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    //time complexity:O(n*n!)
    public static  void printPermutations(String str,int idx, String perm){

        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr,idx+1,perm+currChar);
        }
    }

    

    public static  void main(String []args){
        String str="ABC";
        printPermutations(str,0,"");



    }
}
