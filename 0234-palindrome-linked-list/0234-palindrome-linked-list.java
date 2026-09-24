class Solution {
    public boolean isPalindrome(ListNode head) {

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare both halves
        ListNode front = head;
        ListNode end = prev;

        while (end != null) {
            if (front.val != end.val) {
                return false;
            }

            front = front.next;
            end = end.next;
        }

        return true;
    }
}