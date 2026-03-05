package Linked_list;

public class DisplayingLinkedListRecursively {
    public static void displayRecursively(Node head){
        if(head == null) return;            //base case
        System.out.print(head.val+" ");
        displayRecursively(head.next);

//        displayRecursively(head.next);    //prints the linked list in reverse order
//        System.out.print(head.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b  = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayRecursively(a);

    }
}
