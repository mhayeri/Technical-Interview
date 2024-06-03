#
#   74. Search a 2D Matrix
#   Difficulty: Medium
#   Description: You are given an m x n integer matrix matrix with the following two properties:
#
#   Each row is sorted in non-decreasing order.
#   The first integer of each row is greater than the last integer of the previous row.
#
#   Given an integer target, return true if target is in matrix or false otherwise.
#   You must write a solution in O(log(m * n)) time complexity.
#
#   Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
#   Output: true

#   Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
#   Output: false

from typing import List
from math import ceil


class Solution:

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        top, bottom = 0, ROWS - 1

        while top <= bottom:
            row = (top + bottom) // 2
            if target > matrix[row][-1]:
                top += 1
            elif target < matrix[row][0]:
                bottom -= 1
            else:
                break

        if top > bottom:
            return False

        row = (top + bottom) // 2
        l, r = 0, COLS - 1
        while l <= r:
            middle = (l + r) // 2
            if target > matrix[row][middle]:
                l = middle + 1
            elif target < matrix[row][middle]:
                r = middle - 1
            else:
                return True

        return False
