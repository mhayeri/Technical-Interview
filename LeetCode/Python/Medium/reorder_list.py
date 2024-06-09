#
#   143. Reorder List
#   Difficulty: Medium
#   Description: You are given the head of a singly linked-list. The list can be represented as:
#
#   L0 → L1 → … → Ln - 1 → Ln
#
#   Reorder the list to be on the following form:
#   L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
#
#   You may not modify the values in the list's nodes. Only nodes themselves may be changed.
#
#   Input: head = [1,2,3,4]
#   Output: [1,4,2,3]
#
#   Input: head = [1,2,3,4,5]
#   Output: [1,5,2,4,3]
#
#

from Shared.list_node import ListNode
from typing import Optional


class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Reverse second half of list
        prev, curr = None, slow
        while curr:
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp

        # Now you can reorder the list
        first, second = head, prev
        while second.next:
            tmp = first.next
            first.next = second
            first = tmp

            tmp = second.next
            second.next = first
            second = tmp
