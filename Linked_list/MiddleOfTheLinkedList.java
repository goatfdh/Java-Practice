package Linked_list;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//leetcode - 876
//Appproach 1 --> Two pass Solution(2 times loop)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int mid = len/2 +1;
        temp = head;
        for(int i = 1; i<=mid-1;i++){
            temp = temp.next;
        }
        return temp;
    }
}

//Appproach 2 --> 1 pass solution(without finding the length)/Slow-fast approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}





































