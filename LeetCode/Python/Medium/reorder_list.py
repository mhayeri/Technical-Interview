#
#   735. Asteroid Collision
#   Difficulty: Medium
#   Description: We are given an array asteroids of integers representing asteroids in a row. For each asteroid, the
#   absolute value represents its size, and the sign represents its direction (positive meaning right, negative
#   meaning left). Each asteroid moves at the same speed.
#
#   Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If
#   both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
#
#
#   Input: asteroids = [5,10,-5]
#   Output: [5,10]
#   Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

#   Input: asteroids = [8,-8]
#   Output: []
#   Explanation: The 8 and -8 collide exploding each other.
#
#   Input: asteroids = [10,2,-5]
#   Output: [10]
#   Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
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
