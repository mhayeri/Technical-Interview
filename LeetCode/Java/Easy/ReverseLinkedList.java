/**
 * 206. Reverse Linked List
 * Difficulty: Easy
 * Description: Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Input: head = []
 * Output: []
 */
 public class ReverseLinkedList {
     public ListNode reverseList(ListNode head) {
          ListNode prev = null, curr = head;
          while (curr != null) {
              ListNode temp = curr.next;
              curr.next = prev;
              prev = curr;
              curr = temp;
          }
          return prev;
    }
 }