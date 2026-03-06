package Linked_list;
class SLL2{       //User defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    void size(){
        System.out.println("Length of LL: " + size);
    }
}

public class InsertionAtHeadAndTail {

    public static void main(String[] args) {
        SLL2 list = new SLL2();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);

        list.display();
        list.insertAtHead(24);
        list.display();

        System.out.println(list.size);
        list.size();

//        Insertion
        //T.C = O(1)
        //S.C = O(1)    //when we have tail given

        //T.C = O(n)    //if the tail is not given

        // Length method
//        T.C = O(1)  //when we have head given
//        T.C = O(n)    //if the head is not given

//        display method
//        T.C = O(n)

    }
}
