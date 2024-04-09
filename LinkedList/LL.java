package LinkedList;

public class LL {
    Node head;
    private  int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add: first, last
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

    //delete: first, last
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
    head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }

        size--;
        if(head.next==null){
            head=null;
            return;

        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }


    //print
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

    //print size of linked list
    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list=new LL();//constructor
        list.addFirst("she");
        list.printList();

        list.addLast("is");
        list.printList();

        list.addLast("Shashi");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        list.addFirst("Learning");
        list.addLast("Forever");
        list.printList();
        System.out.println(list.getSize());


    }
}
