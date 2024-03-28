import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class Bits {
    public static void main(String[] args){
        //Get Bit
        //get the 3rd bit(position=2) of a numb n.(n=0101)
        //bit mask:1<<i
        //operation:AND

//        int n=5; //0101
//        int pos=3;
//        int bitMask=1<<pos;
//        int num=bitMask&n;
//        System.out.println(num);
//
//        if((bitMask & n)==0){
//            System.out.println("Bit was zero ");
//        }
//        else
//            System.out.println("bit was one. ");

        //Set bit
        //Set 2nd bit(pos=1) of a num n (n=0101)
//        int n=5; //0101
//        int pos=1;
//        int bitMask=1<<pos;
//        int num=bitMask|n;
//        System.out.println(num);

        //Clear bit
        //clear the 3rd bit (pos=2) of n=0101
//        int n=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        int notBitMask=~(bitMask);
//
//        int newNum=notBitMask &n;
//        System.out.println(newNum);

        //Update bit
        //update 2nd bit(pos=1) of n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter opr:");
        int opr=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;


        //for 1 SET
        //for 0 CLEAR
        if(opr==1){

            int newNum=bitMask|n;
            System.out.println(newNum);
        }
        else {

            int notBitMask=~(bitMask);
             int newNum=notBitMask&n;
            System.out.println(newNum);


        }


    }
}



