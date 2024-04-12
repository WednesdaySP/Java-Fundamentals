package LinkedList;



import java.util.*;

public class ReverseList {
    Node head;
    private int size;

    ReverseList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void  addLast(String data){
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

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curNode=head;
        while (curNode!=null){
            System.out.print(curNode.data+ "->");
            curNode=curNode.next;
        }
        System.out.println("Null");
    }
    public  void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;




    }
    public static void main(String []args){
        ReverseList list=new ReverseList();
         list.addFirst("1");
         list.addLast("2");
         list.addLast("3");
         list.addLast("4");
         list.printList();

         list.reverseIterate();
         list.printList();

//         list.head=list.reverseRecursive(list.Node);
        list.printList();
    }
}
