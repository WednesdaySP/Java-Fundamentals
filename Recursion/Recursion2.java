package Recursion;

import java.util.HashSet;

public class Recursion2 {

    //1. Tower of Hanoi
    //time complexity: O(2^n -1) =O(2n)
    public static  void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+ n+ " from "+ src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+ n+ " from "+ src+" to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);
    }

    //2. Reverse String
    //time complexity:O(n)
    public static  void  revString(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revString(str,index-1);

    }

    //3. Find  occurrence
    //time complexity:O(n)
    public static  int first=-1;
    public  static  int last=-1;
    public static void findOccurance(String word, int indx, char element){

        if(indx==word.length()){
            System.out.println();
            System.out.println(first);
            System.out.println(last);
            return;
        }
        int currentChar=word.charAt(indx);
        if(currentChar==element){
            if(first==-1){

                first=indx;
            }
            else {

                last=indx;
            }
        }
        findOccurance(word,indx+1,element);
    }

    //4. Is sorted(strictly increasing)
    //time complexity:O(n)  i.e. equal to arr.length
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            //if(arr[idx]<arr[idx+1])
            //array is sorted till now
            //return isSorted(arr,idx+1);
            return false;
        }
//        else {
//            return false;
//        }
        return isSorted(arr,idx+1);
    }

    //5. move all X to end of string
    //time complexity= string.length + count => O(n + n)=O(2n) ~ O(n)

    public static  void moveAllX(String str,int idx, int count, String newString){
        if(idx==str.length()){
            for (int i=0;i<count;i++){
                newString+="x";
            }
            System.out.println(newString);
            return;
        }
        char currentChr=str.charAt(idx);
        if(currentChr=='x'){
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else {
            newString+=currentChr;
            moveAllX(str,idx+1,count,newString);
        }
    }

    //6. remove duplicates in a string
    //time complexity: O(n)
    public  static  boolean[] map=new boolean[26];
    public  static  void  removeDuplicates(String st,int idx,String newString){
        if(idx==st.length()){
            System.out.println(newString);
            return;
        }
        char currentChr=st.charAt(idx);
        if(map[currentChr-'a']){
            removeDuplicates(st,idx+1,newString);
        }
        else {
            newString+=currentChr;
            map[currentChr-'a']=true;
            removeDuplicates(st,idx+1,newString);
        }
    }

    //7. print all the subsequences of a string
    //time complexity: O(2^n)

//    public static  void subsequence(String s,int idx,String newString){
//        if(idx==s.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar=s.charAt(idx);
//
//        //to be
//        subsequence(s,idx+1,newString+currChar);
//
//        //or not to be
//        subsequence(s,idx+1,newString);
//    }


//    8. print unique subsequences
    //implemented using HAshSet: only includes unique values
public static  void HashSetsubsequence(String sp,int idx,String newString,HashSet<String> set ){
    if(idx==sp.length()){

        if(set.contains(newString)){
            return;
        }
        else {
            System.out.println(newString);
            set.add(newString);
            return;
        }

    }
    char currChar=sp.charAt(idx);

    //to be
    HashSetsubsequence(sp,idx+1,newString+currChar,set);

    //or not to be
    HashSetsubsequence(sp,idx+1,newString,set);
}

//9. print keypad combination
    //using mapping
    //time complexity:O(4^n)

    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printCombo(String strr,int idx,String combination){
        if(idx==strr.length()){
            System.out.println(combination);
            return;
        }
        char currChar=strr.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombo(strr,idx+1,combination+mapping.charAt(i));
        }
    }

    public  static  void  main(String []args){
        int n=2;
        towerOfHanoi(n,"S","H","D");

//        String str="abcd";
//        revString(str,str.length()-1);

        String word="abaacdaefaahg";
        findOccurance(word,0,'a');

        int []arr={1,2,2};
        System.out.println(isSorted(arr,0));
        String str="axbcxxd";
        moveAllX(str,0,0,"");

        String st="abbccda";
        removeDuplicates(st,0,"");

//        String s="abc";
//        subsequence(s,0,"");

        String sp="aaa";
        HashSet<String> set=new HashSet<>();
        HashSetsubsequence(sp,0,"",set);

        String strr="0";
        printCombo(strr,0,"");
    }
}
