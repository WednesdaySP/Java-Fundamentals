import java.util.Scanner;

public class Strings {
    //NOTE: Strings are IMMUTABLE

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //next for a single word
        //nextLine for a sentence
//        String name=sc.nextLine();
//        System.out.println("Your name is:"+ name);

        //concatenation
//        String firstName="Shashi";
//        String lastName="Prabha";
//        String fullName=firstName+" "+lastName;
//
//        //length
//        System.out.println(fullName.length());
//
//        //charAt: print characters in the string
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }

        //comparison of strings
//        String name1="tony";
//        String name2="tony";

//        if(name1.compareTo(name2)==0){
//            System.out.println("Strings are equal");
//        }
//        else
//            System.out.println("Strings are not equal");

//        if(name1==name2)
//            System.out.println("Strings are same");
//        else System.out.println("Strings are not same");
//
//        //compareTo is used in place of == bcoz == may not give correct result sometimes
//
//        if(new String("Tony")==new String("Tony"))
//            System.out.println("Strings are same");
//        else
//            System.out.println("Strings are not same");


        //substring(beg index, end index)
//        String sentence="I am learning Java";
//        String name=sentence.substring(14,sentence.length());
//        System.out.println(name);

        //parseInt
//        String num="1234";
//        int str=Integer.parseInt(num);
//        System.out.println(str);
//
       //toString
//        int nm=227;
//        String stt=Integer.toString(nm);
//        System.out.println(stt.length());


        //HOMEWORK PROBLEMS

        //1.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

//        System.out.println("enter size:");
//        int size= sc.nextInt();
//
//        String arr[]=new String[size];
//
//        int totalLength=0;
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextLine();
//            totalLength +=arr[i].length();
//        }
//        System.out.println(totalLength);

        //2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

//        System.out.println("Enter a word:");
//        String words=sc.nextLine();
//        String result="";

//        for(int i=0;i<words.length();i++){
//            if(words.charAt(i)=='e'){
//                result+='i';
//            }
//            else
//                result+=words.charAt(i);
//        }
//        System.out.println(result);

        //3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

        System.out.println("Enter email:");
        String email=sc.nextLine();
        String userName="";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else
                userName+=email.charAt(i);
        }
        System.out.println(userName);
        //in this code before encountring @ symbol the else block  executes and appends all the letters before @ in userName and when @ is encountered if block break executes and the loop stops and prints the userName.



    }
}
