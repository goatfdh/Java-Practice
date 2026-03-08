package Linked_list;

import java.util.*;

 class SLL9 {
        Node head;
        Node tail;

        // ✅ Fix 2: Corrected insertAtTail logic
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;   // first node
                return;
            }
            tail.next = temp;         // link new node at end
            tail = temp;              // move tail forward
        }

        // ✅ Fix 3: Use 'val' not 'value'
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ✅ Fix 4: Find node by value, then delete it
        void delete(int value){
            Node temp = head;

            if(head == null) return;

            if(head.val == value){
                head = head.next;
                return;
            }

            while(temp.next != null){
                if(temp.next.val == value){
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public class DeletingANodeTakingInputs {
        public static void main(String[] args) {
            // ✅ Fix 5: Use 'SLL' not 'LinkedList'
            SLL9 list = new SLL9();
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int value = sc.nextInt();
                list.insertAtTail(value);   // ✅ Fix 6: call on object
            }

             System.out.print("Before delete: ");
             list.display();

            int nodeVal = sc.nextInt();
            list.delete(nodeVal);           // ✅ Fix 7: call on object

             System.out.print("After delete: ");
             list.display();
        }
    }
