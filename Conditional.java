import java.util.*;
public class Conditional {

    public  static void main (String[] arg){
        //if, else ,else if, switch, break

        Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//
//        if(age >=18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }


        //even odd
//        int x=sc.nextInt();
//
//        if(x%2==0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


//        int a= sc.nextInt();
//        int b=sc.nextInt();
//
//        if(a == b){
//            System.out.println("Both are equal");
//        }
//        else if(a > b){
//            System.out.println("A is greater");
//
//        }
//        else{
//            System.out.println("B is greater");
//        }


        //robo press button
//        int btn=sc.nextInt();
//
//        if(btn ==1){
//            System.out.println("Hello");
//        }
//        else if( btn ==2){
//            System.out.println("Namaste");
//        }
//        else if (btn ==3){
//            System.out.println("Bonjour");
//        }
//
//        else{
//            System.out.println("Invalid");
//        }


        //switch case for robo button

//        switch (btn){
//            case 1:
//                System.out.println("Hello");
//                break;
//            case 2:
//                System.out.println("Namaste");
//                break;
//            case  3:
//                System.out.println("Bonjour");
//                break;
//            default:
//                System.out.println("Invalid button");
//        }

//        System.out.println("enter a:");
//        int a =sc.nextInt();
//        System.out.println("enter b:");
//        int b=sc.nextInt();
//        System.out.println("enter opr:");
//        int opr=sc.nextInt();
//
//        /**
//         * 1 -> +
//         * 2 -> -
//         * 3 -> *
//         * 4 -> /
//         * 5 -> %
//         */
//
//
//        if(opr == 1){
//            System.out.println(a +b);
//        }
//        else if(opr == 2){
//            System.out.println(a -b);
//        }
//        else if (opr == 3){
//            System.out.println(a * b);
//        }
//        else if(opr == 4){
//            if (b==0){
//                System.out.println("Invalid division");
//            }
//            else {
//
//                System.out.println(a / b);
//            }
//        }
//        else if( opr == 5){
//            if (b==0){
//                System.out.println("Invalid division");
//            }
//            else {
//
//                System.out.println(a % b);
//            }
//        }
//        else{
//            System.out.println("Invalid operator");
//        }
//
//
//        int userInput =sc.nextInt();
//
//        switch (userInput){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case  10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Invalid month");
//        }
//


//        for(int counter =0; counter <=10; counter++){
//            System.out.print(counter+" ");

//        int i=0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//
//        }

//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while (i<6);

//        System.out.println("Enter value of n: ");
//        int n=sc.nextInt();

//        int sum=0;
//        for( int i=1; i<=n;i++){
//            sum=sum+i;
//            System.out.println(sum);
//        }
        //table of 2
//        for(int i=1;i<11;i++){
//            System.out.println(i*n);
//        }


        //EVEN NO. TILL N
//        for(int i=0; i<=n;i++){
//            if(i%2==0){
//
//                System.out.println(i);
//            }
//
//        }

//        for(;;){
//            System.out.println("Shashi Prabha");
//            //output: infinite loop of shashi prabha
//        }


        System.out.println("Enter a number (0 or 1):");
        int num1=sc.nextInt();
//        if(num1 ==1){
//            System.out.println(
//                    "Enter student marks (out of 100):"
//            );
//            
//        }
//        else
//            System.out.println("Stop");

        do{
            System.out.println("Enter score:");
            int marks=sc.nextInt();

            if(marks >=90){
                System.out.println("This is Good");
                

            }
            else if(marks >=60 && marks<=88){
                System.out.println("This is also Good");
            } else if (marks>=0 && marks<=58) {

                System.out.println("This is Good as well");
            }
            else
                System.out.println("Invalid marks");
           }
        while (num1 ==1);
    }
}
