import java.util.*;
public class Array {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter size:");
//        int size=sc.nextInt();
//
//        int numbers[]=new int[size];
//
//        //input
//        for(int i=0;i<size;i++){
//            System.out.println("Enter array elements:");
//            numbers[i]= sc.nextInt();
//        }
//        System.out.println("Enter value of x:");
//        int x= sc.nextInt();
//
//        for (int i=0;i<numbers.length;i++){
//            if(numbers[i]==x){
//                System.out.println("x found at index "+ i);
//            }
//        }

//
//        //2. Take an array of names as input from the user and print them on the screen.
//        System.out.println("Enter arr size:");
//        int size=sc.nextInt();
//
//        String names[]=new String[size];
//
//        //input
//        for(int i=0;i<size;i++){
//             names[i]=sc.next();
//        }
//
//        //output
//        for(int i=0;i< names.length;i++){
//            System.out.println("Names in the array are: "+ names[i]);
//        }

        //3. Find the maximum & minimum number in an array of integers.
//
//        System.out.println("Enter size:");
//        int sz=sc.nextInt();
//
//        int numbers[]=new int[sz];
//
//        //input
//        for(int i=0;i<sz;i++){
//            System.out.println("Enter array elements:");
//            numbers[i]= sc.nextInt();
//        }
//        int min=Integer.MIN_VALUE;
//        int max=Integer.MAX_VALUE;
//
//        for (int i=0;i<numbers.length;i++){
//            if(numbers[i]<min){
//                min=numbers[i];
//            }
//            if (numbers[i]> max)
//                max=numbers[i];
//        }
//        System.out.println("Largest num is: "+ max);
//        System.out.println("Smallest num is: "+ min);
//
//

//        System.out.println("Enter size:");
//        int sz=sc.nextInt();

//        int numbers[]=new int[sz];
//
//        //input
//        for(int i=0;i<sz;i++){
//            System.out.println("Enter array elements:");
//            numbers[i]= sc.nextInt();
//        }
//
//        boolean isAscending=true;
//
//        for(int i=0;i< numbers.length-1;i++){
//            if(numbers[i]> numbers[i+1]){
//                isAscending=false;
//            }
//        }
//        if(isAscending){
//            System.out.println("Array is sorted in ascending order");
//        }
//        else {
//            System.out.println("Array  is not sorted in ascending order.");
//        }

        System.out.println("Enter no of rows:");
        int rows= sc.nextInt();
        System.out.println("Enter no of cols: ");
        int cols=sc.nextInt();

        int [][] number=new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                number[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter value of x:");
        int x=sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
//                System.out.print(number[i][j]+" ");
                if(number[i][j]==x)
                     System.out.println("x found at location("+ i+ ","+j+")");
            }
//            System.out.println();

        }
    }
}
