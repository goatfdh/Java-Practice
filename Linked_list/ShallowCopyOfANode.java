package Linked_list;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node temp = a;  //shallow copy
        //temp shallow copy has full access to a
//        Node temp = new Node(100);  //deep copy
//        System.out.println(a);
//        System.out.println(temp);
        temp.val = 12;
        System.out.println(a.val);
    }
}
