package Recursion;

public class Recursion {

    //Print numb from 5 to 1:
    //recursion calls are stored in  stack structure
//    public static void printNumb(int n){
//        if(n==0) //base case
//            return;
//        System.out.println(n); // print
//        printNumb(n-1); //recursion
//
//    }

    //print num from 1 to 5
//    public static void printNum(int nm){
//        if(nm==6) //base case
//            return;
//        System.out.println(nm); // print
//        printNum(nm+1); //recursion
//
//    }

    //print sum of first n natural numbers
//    public static  void sumNatural(int num, int end, int sum){
//
//        if(num==end){
//            sum +=num;
//            System.out.println(sum);
//            return;
//        }
//       sum +=num;
//        sumNatural(num+1,end,sum);
//        System.out.println(num);
//    }

    public static int printFactorial(int n){
        if(n==1 || n==0)
            return 1;
        int fact_nm1=printFactorial(n-1);
        int fact_n=n*fact_nm1;

       return fact_n;


    }
    public static void main(String[] args) {
//        System.out.println("numbers from 5 to 1");
//        printNumb(5);
//        System.out.println("numbers from 1 to 5");
//        printNum(1);
//        System.out.println("sum of n natural num");
//        sumNatural(1,6,0);

        int result=printFactorial(7);
        System.out.println(result);

    }
}
