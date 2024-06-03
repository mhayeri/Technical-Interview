#
#   21. Merge Two Sorted Lists
#   Difficulty: Easy
#   Description: You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list.
#   The list should be made by splicing together the nodes of the first two lists.
#
#   Return the head of the merged linked list.
#
#   Input: list1 = [1,2,4], list2 = [1,3,4]
#   Output: [1, 1, 2, 3, 4, 4]

#   Input: list1 = [], list2 = []
#   Output: []

from Shared.list_node import ListNode
from typing import Optional


class Solution:

    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:
        dummy = node = ListNode()

        while list1 and list2:
            if list1.val < list2.val:
                node.next = list1
                list1 = list1.next
            else:
                node.next = list2
                list2 = list2.next
            node = node.next

        node.next = list1 or list2

        return dummy.next
