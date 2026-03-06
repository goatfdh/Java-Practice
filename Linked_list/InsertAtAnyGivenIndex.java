package Linked_list;
class SLL3{       //User defined data structure
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

    void insert(int idx, int val){
        if(idx == 0 ){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1; i<=idx-1 ;i++){
            x = x.next;    //traversal
        }
        //insertion
        temp.next = x.next;
        x.next = temp;
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

public class InsertAtAnyGivenIndex {

    public static void main(String[] args) {
        SLL3 list = new SLL3();
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

        list.insert(7,67);
        list.display();

    }
}

//Base cases: O(1)
//1) if(idx==0) -> Insert at head
//2) if(idx==size) -> Insert at tail
//3) if(idx > size) -> error throw, message throw invalid index

//T.C = O(n)
//S.C = 0