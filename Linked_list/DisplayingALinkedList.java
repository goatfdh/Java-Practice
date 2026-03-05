package Linked_list;

public class DisplayingALinkedList {
    public static void print(Node head){
        Node temp = head;
//        for(int i = 1; i<=5;i++){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//            //this can give error sometimes
//        }
//
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
                    //better to use this while loop
                    //linked list will print forward to whatever we pass as the head
                }

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

           print(a);

    }
}
