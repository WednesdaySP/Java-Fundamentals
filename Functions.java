import java.util.*;
public class Functions {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return  sum;
    }

    public static  int calculateProduct(int a, int b){
        return a*b;
    }


    public static void calculateFactorial(int n){
        int factorial =1;
        if(n<0){
            System.out.println("Invalid number");
            return;
        }

            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }

        System.out.println("factorial is: "+factorial);
        return ;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int sum=calculateSum(a,b);

        System.out.println("Sum of 2 numbers is " + sum);

        int prod=calculateProduct(a,b);
            System.out.println("Product of 2 no. is " + a*b);

        calculateFactorial(n);


    }
}
