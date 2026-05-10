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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            length += 1;
        }

        curr = head;

        //finds length of the list

        ListNode prev = dummy;

        for (int i = 0; i < length-n; i++) {
            curr = curr.next;
            prev = prev.next;
        }

        curr = curr.next;
        prev.next = curr;

        return dummy.next;
    }
}
