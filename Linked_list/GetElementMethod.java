package Linked_list;
class SLL4{       //User defined data structure
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

    int getElement(int idx) throws Error{
        if(idx == size-1) return tail.val;
        if(idx >= size || idx<0) {
            throw new Error("Invalid Index!!");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
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

public class GetElementMethod {

    public static void main(String[] args) {
        SLL4 list = new SLL4();
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

        System.out.println(list.getElement(7));

//      T.C = O(n) //as we have to traverse through each node to get an element at a particular index

    }
}



