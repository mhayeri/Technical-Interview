/**
 * 2807. Insert Greatest Common Divisors in Linked List
 * Difficulty: Medium
 * Description: Given the head of a linked list head, in which each node contains an integer value.
 *
 * Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
 *
 * Return the linked list after insertion.
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 * Input: head = [18,6,10,3]
 * Output: [18,6,6,2,10,1,3]
 * Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after
 * inserting the new nodes (nodes in blue are the inserted nodes).
 * - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
 * - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
 * - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
 * There are no more adjacent nodes, so we return the linked list.
 *
 */
public class InsertGreatestCommonDivisor {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head, curr = head.next;
        while (curr != null) {
            int gcd = getGCD(prev.val, curr.val);
            ListNode gcdNode = new ListNode(gcd);
            prev.next = gcdNode;
            gcdNode.next = curr;
            prev = curr;
            curr =  curr.next;
        }

        return head;
    }

    private int getGCD(int val1, int val2) {
        if (val2 == 0) return val1;
        return getGCD(val2, val1 % val2);
    }
}