
public class Pattern2 {

    public static void main(String [] args){




//butterfly pattern
        System.out.println("Butterfly pattern");
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


        //solid trapezium
        System.out.println("Solid trapezium");

        int m=5;
        for(int i=1;i<=m;i++){
            //
            int spc= m-i;
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //number pyramid
        System.out.println("Number Pyramid");

        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //palindromic pattern
        System.out.println("PALINDROME");
        for(int i=1;i<=m;i++){
            //spaces
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //diamond pattern with spaces in btw
        System.out.println("DIAMOND");
        for(int i=1;i<=m;i++){
            //spaces
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            //top half
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=m-1;i>=1;i--){
            //spaces
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            //bottom half
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //diamond pattern without spaces in btw
        System.out.println("Diamond without in btw spaces");

        for(int i=1;i<=m;i++){
            //spaces
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            //left upper half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //stars using new logic for printing 2 parts of diamond

        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
