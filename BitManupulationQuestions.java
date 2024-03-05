import java.util.*;
public class BitManupulationQuestions {

    //1.
    public static  void powerOfTwo(int number){

        if((number & number-1)==0){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    //2.
    public static void toggle(int n, int pos){
        int bitMask=1<<pos;
        int newNum=bitMask ^ n;
        System.out.println("new number is:"+newNum);
    }

    //3.
    public static void bitcount(int n){
        int count = 0;
        while( n > 0 ){
            count = count + 1;
            n = n & (n - 1);
        }
        System.out.println("Count of bit in 1's compliment:"+count);

    }
    public  static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[32];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        1.Write a program to find if a number is a power of 2 or not.
//        2.Write a program to toggle a bit a position = “pos” in a number “n”.
//        3.Write a program to count the number of 1’s in a binary representation of the number.
//        4.Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

        System.out.println("number:");
        int number=sc.nextInt();
        powerOfTwo(number);


        System.out.println("n:");
        int n=sc.nextInt();
//        System.out.println("pos:");
//        int pos= sc.nextInt();
//        toggle(n,pos);


      bitcount(n);
      decToBinary(n);



    }
}
