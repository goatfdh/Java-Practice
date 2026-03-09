package Linked_list;

import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class SLL{
    Node head;
    Node tail;
    void append(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SLL ll = new SLL();
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            int value = sc.nextInt();
            ll.append(value);
        }

        Node slow = ll.head;
        Node fast = ll.head;
        while(fast!=null && fast.next !=null){     //1 pass solution
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.val);
    }
}