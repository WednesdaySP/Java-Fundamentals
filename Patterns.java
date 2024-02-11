import java.util.*;
public class Patterns {
    public static  void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("n:");
        int n=sc.nextInt();
//        System.out.println("m:");
//        int m=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //square matrix of stars *


        //hollow square
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }

        //half pyramid

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //inverted  half pyramid

//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //MIRROR IMAGE OF HALF PYRAMID

        for(int i=1;i<=n;i++){
            //for spaceing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //to print stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //HALF NUMBER PYRAMID

        for(int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //HALF INVERTED NUMBER PYRAMID
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //OR use formula j<=n-i+1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Floyd's Triangle

        int number =1;
        System.out.println("Floyd's Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        //0 AND 1 Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum %2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }



    }


}
