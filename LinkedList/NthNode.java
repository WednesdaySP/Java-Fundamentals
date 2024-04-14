//package LinkedList;
//
//public class NthNode {
//    //find nth node from last and delete it
//    Node head;
//    private int size;
//
//
//    NthNode(){
//        size=0;
//
//    }
//
//    class Node{
//        Integer data;
//        Node next;
//
//        Node(Integer data){
//            this.data=data;
//            this.next=null;
//            size++;
//        }
//    }
//
//    public Node removeNthFromEnd(int n){
//        if(head.next==null){
//            return null;
//        }
//
//        int size=0;
//        Node currNode=head;
//        while(currNode!=null){
//            currNode=currNode.next;
//            size++;
//        }
//
//        if(n==size){
//            return  head.next;
//        }
//
//        Node prevNode=head;
//        int indexToSearch=size-n;
//        int i=1;
//        while(n<indexToSearch){
//            prevNode=prevNode.next;
//            i++;
//        }
//        prevNode.next=prevNode.next.next;
//        return head;
//    }
//
//    public static  void  main(String[]args){
//        NthNode list = new NthNode();
//        list.head = list.new Node(1);
//        list.head.next = list.new Node(2);
//        list.head.next.next = list.new Node(3);
//        list.head.next.next.next = list.new Node(4);
//
//        list.head = list.removeNthFromEnd(3);
//    }
//
//}


package LinkedList;

public class NthNode {
    private Node head;
    private int size;

    NthNode() {
        size = 0;
        head = null;
    }

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public Node removeNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return head;
        }

        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head; // n is greater than the size of the list
            }
            fast = fast.next;
        }

        // Move fast to the end, maintaining the gap of n between fast and slow
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is pointing to the node just before the nth node from the end
        slow.next = slow.next.next; // Remove the nth node from the end

        return dummy.next; // Return the head of the modified list
    }

    public static void main(String[] args) {
        NthNode list = new NthNode();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        list.head = list.removeNthFromEnd(5);

        // Print the modified list
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
