package LinkedList;

import java.util.*;

public class LLPractice {

    Node head;
    private int size;


    LLPractice(){
        size=0;

    }

    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;//entry point of newNode in list
        head=newNode;//now new node is the first node(head node)
    }

    public void  addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    public  void addMiddle(int indx,Integer data){
        if(indx>size||indx<0){
            System.out.println("Invalid index");
            return;
        }
        size++;

        Node newNode=new Node(data);
        if(head==null||indx==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node currNode=head;
        for(int i=1;i<size;i++){
            if(i==indx){
                Node nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;
            }
            currNode=currNode.next;
        }
    }
    public void printList(){
        Node currNode=head;
        while(currNode.next!=null){
            System.out.print(currNode.data+ " ");
            currNode=currNode.next;

        }
        System.out.println();

    }
//    public void search(int data){
////        int indx=printList();
//        for(int i=0;i<=size;i++){
//            if(data!=indx)
//        }
//
//    }
public int searchList(int num){
    Node currNode=head;
    int indx=0;
    while(currNode.next!=null){
        if(currNode.data==num){
        return indx;}

        currNode=currNode.next;
        indx++;

    }
    return -1;//if element is not found.

}
public void delete(int value){
        while(head!=null && head.data>value){
            head=head.next;
        }
        Node currNode=head;
        while(currNode!=null && currNode.next!=null){
            if(currNode.next.data>value){
                currNode.next=currNode.next.next;
            }
            else {
                currNode=currNode.next;
            }
        }
}

    public static void main(String []args){
//        LinkedList<String> list=new LinkedList<String>();

//        list.add("is");
//        list.add("a");
//        list.addLast("list");
//        list.addFirst("This");
//        list.add(3,"linked");
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());




//        list.remove(3);
//        list.removeFirst();
//        list.removeLast();
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list);


        LLPractice list=new LLPractice();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in range 1-50:");
        int n;
        do{
            n=sc.nextInt();
            if(n>=1 && n<=50){
                list.addLast(n);
            } else if (n!=0) {
                System.out.println("invalid input!");

            }
        }while(n!=0);{
            System.out.println("Original list:");
            list.printList();

            list.delete(25);
            System.out.println("List after deleting number greater than 25");
            list.printList();

        }
//        list.addFirst(3);
//        list.addFirst(7);
//        list.addFirst(5);
//        list.addFirst(1);
//        list.addLast(8);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(8);
//        list.printList();

//        int indx=list.searchList(3);
//        if(indx!=-1){
//            System.out.println( "Number is found at index" + indx);
//        }
//        else {
//            System.out.println("Number not found.");
//        }

        //2.
//        while(n>0&&n<=50);{
//            list.addFirst(sc.nextInt());
//            n--;
//        }
//        sc.close();
//        System.out.println(list);





    }
}
