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

    //2. N-Queens problem
    //n*n chessboard
    //n queens
    //print all solutions where queen is safe

//    public List<List<String>> solveNQueens(int n){
//        List<List<String>> allBoards=new ArrayList<>();
//        char[][]board=new board[n][n];
//        helper(board,allBoards,0);
//    }

    public static  void main(String []args){
        String str="ABC";
        printPermutations(str,0,"");



    }
}
