/**
 * 203. Remove Linked List Elements
 * Difficulty: Easy
 * Description: Given the head of a linked list and an integer val, remove all the nodes of the linked list
 * that has Node.val == val, and return the new head.
 *
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy, curr = dummy.next;
        while (curr != null) {
            if (curr.val == val) {
                curr = curr.next;
                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}