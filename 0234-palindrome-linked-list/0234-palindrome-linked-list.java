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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        //find middle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse second half from middle
        ListNode curr = slow;
        ListNode prev = null;
        ListNode temp = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //compare both halves
        ListNode front = head;
        ListNode end = prev;

        while(front!=slow){
            if(front.val == end.val){
                front = front.next;
                end = end.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}