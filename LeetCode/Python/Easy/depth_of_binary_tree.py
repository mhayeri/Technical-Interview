#
#   104. Maximum Depth of Binary Tree
#   Difficulty: Easy
#   Description: Given the root of a binary tree, return its maximum depth. A binary tree's maximum depth is the
#   number of nodes along the longest path from the root node down to the farthest leaf node.

#   Input: root = [3,9,20,null,null,15,7]
#   Output: 3

#   Input: root = [1,null,2]
#   Output: 2

from Shared.tree_node import TreeNode
from collections import deque
from typing import Optional


class Solution:

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        q = deque()
        levels = 0

        if root:
            q.append(root)

        while q:
            for _ in range(len(q)):
                curr = q.popleft()
                if curr.left:
                    q.append(curr.left)
                if curr.right:
                    q.append(curr.right)

            levels += 1

        return levels
