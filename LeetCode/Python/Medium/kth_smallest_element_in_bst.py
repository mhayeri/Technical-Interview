#
#   230. Kth Smallest Element in a BST
#   Difficulty: Medium
#   Description: Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes
#   in the tree.

#   Input: root = [3,1,4,null,2], k = 1
#   Output: 1

#   Input: root = [5,3,6,2,4,null,null,1], k = 3
#   Output: 3

from Shared.tree_node import TreeNode
from typing import Optional


class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        stack = []
        curr = root

        while stack or curr:
            while curr:
                stack.append(curr)
                curr = curr.left
            curr = stack.pop()
            k -= 1
            if k == 0:
                return curr.val
            curr = curr.right

        return 0
