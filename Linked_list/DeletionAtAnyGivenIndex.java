package Linked_list;

class SLL8 {
    Node head;
    Node tail;
    int size;

    void deleteAtHead() throws Error {
        if (head == null) throw new Error("List is empty!!");
        head = head.next;
        size--;

    }

    void deleteAtIndex(int idx) throws Error {
        if(idx ==0){
            deleteAtHead();
            return;
        }
        if (head == null) throw new Error("List is empty!!");
        if (idx < 0 || idx >= size) {
            throw new Error("Invalid index!!");
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if(temp.next == tail){
            tail = temp;            //check for tail
        }
        temp.next = temp.next.next;   //deletion
        size--;

    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    void size() {
        System.out.println("Length of LL: " + size);
    }
}


public class DeletionAtAnyGivenIndex {
    public static void main(String[] args) {
        SLL8 list = new SLL8();
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);

        list.deleteAtIndex(2);


        list.display();
        list.deleteAtHead();

        list.display();
        list.insertAtHead(24);
        list.display();

        System.out.println(list.size);
        list.size();

        list.display();

    }


}
