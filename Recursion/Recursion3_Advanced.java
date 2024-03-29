package Recursion;

import java.util.ArrayList;

public class Recursion3_Advanced {

    //1. print all permutations of a string
    //time complexity: O(n!)
    public static void printPerm(String str, String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);

            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            printPerm(newString,permutation+currChar);

        }
    }

    //2. count total paths in a maze to move from (0,0) to (n,m)
    //n=3, m=3
    //uses backtracking  & has much high time complexity there for we will solve it using dynamic programming

    public static  int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 ||j==m-1){
            return 1;
        }
        int rightPaths=countPaths(i+1,j,n,m);
        int downPaths=countPaths(i,j+1,n,m);
        return rightPaths+downPaths;
    }

    //3. place tiles of size 1*m in a floor of size n*m
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
            //becoz jb n ==m, to ek square matrix banti h, or is square matrix m tiles place kr n k 2 tareke ho skte h i.e. horizontal and vertical.
        }
        if (n<m){
            return 1;
            //becoz jb n m se chota hoga to humare pass vertical blocks horizontal blocks se km honge otr isiliye hum tiles ko sirf horizontal direction m place kr skte h i.e. only 1 direction
        }
        int vertPlacement=placeTiles(n-m,m);
        int horPlacement=placeTiles(n-1,m);
        return vertPlacement+horPlacement;
    }

    //4. print ways to invite n guest in your party (single or in pairs of 2)
    public static  int callGuest(int n){
        if(n<=1){
            return 1;
            //i.e. if we have only 1 guest return 1
            //also if 0 guest then also return 1
        }
        //single
        // from total n guest 1 person comes, therefore n-1
        int way1=callGuest(n-1);

        //pairs
        //after choosing 1 guest by (n-1) now we have (n-2) choices for his partner guest.
        int way2=(n-1)* callGuest(n-2);

        return  way1+way2;
    }

    //5. print all the subsets of a set of first natural numbers
    //subset means ki us number k pass choice h ki vo sub set m add hona chahta h ya nhi
    public static  void printSubset(ArrayList<Integer> subset){
        for(int i=0;i< subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();

    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){ //reached at end of set
            printSubset(subset);
            return;

        }


        //add hoga
        subset.add(n);
        findSubset(n-1,subset);

        //add nhi hoga
        subset.remove(subset.size()-1); //remove n from end of subset
        findSubset(n-1,subset);
    }


    public static void main(String []args){
        String str="abc";
        printPerm(str,"");

//        int n=3,m=4;
//        int totalPaths=countPaths(0,0,n,m);
//        System.out.println(totalPaths);

//        int n=4, m=2;
//        System.out.println(placeTiles(n,m));

//        int n=4;
//        System.out.println(callGuest(n));

        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n,subset);
    }
}
