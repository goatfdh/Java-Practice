package Linked_list;

class Node{                 //user-defined data type
    int val;
    Node next;
    Node(int val){                //parameterised constructor
        this.val = val;   //assigning value
    }
}

public class listNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b  = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a);  //Prints the address of that node here --> a //@8efb846
        System.out.println(a.val);  //Prints the value of the node a

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next.val);   //prints value stored in b
        System.out.println(a.next.next.val);  //prints value stored in c
        System.out.println(a.next.next.next.val); //prints value stored in d
        System.out.println(a.next.next.next.next.val);  //prints value stored in e
        System.out.println(a.next.next.next.next.next);  //prints the default null thing

        //the above method is used to access all the values using a single variable
        //also this works only when each node is linked to the next node
        //if there is any node which is not in the link the above method will no longer work

    }
}
