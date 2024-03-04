import java.util.*;
public class StrBuilderProblems {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //HOMEWORK PROBLEMS

        //1.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


//        System.out.println("Enter size:");
//        int size=sc.nextInt();
//
//        StringBuilder arr[]=new StringBuilder[size];
//        int totLength=0;
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]= new StringBuilder(sc.nextLine());
//            totLength+=arr[i].length();
//        }
//        System.out.println("Total length is: "+totLength);


        //2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

        System.out.println("Enter a string:");
        StringBuilder userInput=new StringBuilder(sc.nextLine());

        StringBuilder result= new StringBuilder();
        for(int i=0;i<userInput.length();i++){
            if(userInput.charAt(i)=='e'){
                result.append('i');
            }
            else {
                result.append(userInput.charAt(i));
            }

        }
        System.out.println(result);

        //3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

        System.out.println("Enter email:");
        StringBuilder email=new StringBuilder(sc.nextLine());

        StringBuilder userName=new StringBuilder();

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else {
                userName.append(email.charAt(i));
            }
        }
        System.out.println(userName);
    }
}
