#
#   102. Binary Tree Level Order Traversal
#   Difficulty: Medium
#   Description: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
#
#   Input: root = [3,9,20,null,null,15,7]
#   Output: [[3], [9, 20], [15, 7]]
#


from typing import List, Optional
from Shared.tree_node import TreeNode
from collections import deque


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        levels = []
        q = deque()

        if root:
            q.append(root)

        while q:
            curr_level = []
            for _ in range(len(q)):
                curr = q.popleft()
                if curr.left:
                    q.append(curr.left)
                if curr.right:
                    q.append(curr.right)
                curr_level.append(curr.val)
            levels.append(curr_level)

        return levels
