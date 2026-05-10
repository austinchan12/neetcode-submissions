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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify logic
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry; // Start with the carry value

            if (l1 != null) {
                sum += l1.val; // Add value from l1
                l1 = l1.next;  // Move to the next node in l1
            }

            if (l2 != null) {
                sum += l2.val; // Add value from l2
                l2 = l2.next;  // Move to the next node in l2
            }

            carry = sum / 10; // Calculate carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node for the current digit
            current = current.next; // Move to the next node
        }

        return dummy.next; // Return the actual result, skipping the dummy node
    }
}
