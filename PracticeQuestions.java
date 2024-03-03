import java.util.*;
//1
public class PracticeQuestions {
//    public static void calculateAvg(int a, int b, int c){
//        int avg=a+b+c/3;
//        System.out.println("Avg of 3 numbers is: "+avg);
//        return;
//    }

    //2
//    public static void calculateSum(int n){
//
//        int sum=0;
//        for (int i=1;i<=n;i++){
//           if(i%2!=0){
//                sum=sum+i;
//
//           }
//      }
//    System.out.println(sum);
//   }
//
//    //3
//    public static void greaterNum(int x, int y){
//        if(x>y)
//            System.out.println(" greater number is "+ x);
//        else if(x==y)
//            System.out.println( "both are equal");
//        else
//            System.out.println(" greater number is "+ y);
//
//    }
//
//    //4
//    public static void circleCircumfrance(int radius){
//        double crf=2 *3.14*radius;
//        System.out.println("Circumfrance of circle is: "+crf);
//    }
//
//    //5
//    public static void forVote(int age){
//        if(age>=18)
//            System.out.println("Congrats! you are eligible to vote");
//        else if(age < 18)
//            System.out.println("Opps! you are not eligible to vote");
//        else
//            System.out.println("Invalid age");
//    }
//
//    //6
//    public static void infinite(int input){
//        do {
//            System.out.println(input++);
//
//        }
//        while (input !=0);
//    }

    //7
//    public static void userNumbers(Scanner sc){
//        int pcount=0;
//        int ncount=0;
//        int zcount=0;
//        char choice;
//        do{
//            System.out.println("Enter a number");
//            int number=sc.nextInt();
//
//            if(number>0)
//                pcount++;
//            else if (number<0)
//                ncount++;
//            else
//                zcount++;
//
//            System.out.println("Do you want to enter another number?");
//
//            choice=sc.next().charAt(0);
//        }
//        while (choice=='y'|| choice=='Y');
//
//        System.out.println("Total positive numbers: " + pcount);
//        System.out.println("Total negative numbers: "+ ncount);
//        System.out.println("Total zeros: "+ zcount);
//    }

    //8
    public static void powerNumber(int p, int q){


        int result =1;
        for(int i=0;i<=q;i++){
            result=result*p;
            System.out.println(p+" power "+q+" is "+result);
        }


    }

    public static void greatestCommonFactor(int n1,int n2){
        while(n2!=n1){
            if(n1>n2){
                n1=n1-n2;
            }
            else
                n2=n2-n1;
        }
        System.out.println("GCD is : "+ n2);
    }

    public static void calculateFibonachi(int num){
        int a=0;
        int b=1;
        System.out.print(a+" ");

        if(num>1){
            for(int i=2;i<=num;i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //1.average question
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();

//        calculateAvg(a,b,c);

//        //2.odd sum
//        System.out.println("Enter a number:");
//        int n=sc.nextInt();
//        calculateSum(n);
//
//        //3. greater number
//        System.out.println("Enter num1");
//        int x=sc.nextInt();
//
//        System.out.println("Enter num2");
//        int y=sc.nextInt();
//        greaterNum(x,y);
//
//        //4
//        System.out.println("Enter radius:");
//        int radius=sc.nextInt();
//        circleCircumfrance(radius);
//
//        //5
//        System.out.println("Enter your age:");
//        int age=sc.nextInt();
//        forVote(age);
//
//        //6
//        System.out.println("input value:");
//        int input=sc.nextInt();
//        infinite(input);

        //7
//        userNumbers(sc);
//        sc.close();

        //8: power
        System.out.println("Enter a base number:");
        int p=sc.nextInt();

        System.out.println("Enter a power number:");
        int q=sc.nextInt();
        powerNumber(p,q);


        System.out.println("n1:");
        int n1= sc.nextInt();

        System.out.println("n2:");
        int n2= sc.nextInt();

        greatestCommonFactor(n1,n2);

        System.out.println("num:");
        int num=sc.nextInt();
        calculateFibonachi(num);

    }
}
