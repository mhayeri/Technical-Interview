#
#   54. Spiral Matrix
#   Difficulty: Medium
#   Description: Given an m x n matrix, return all elements of the matrix in spiral order.
#
#   Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
#   Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
#

from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        i, j = 0, 0
        res = []

        # DIRECTIONS
        RIGHT, DOWN, LEFT, UP = 0, 1, 2, 3

        # WALLS
        RIGHT_WALL = n
        DOWN_WALL = m
        LEFT_WALL = -1
        UP_WALL = 0

        # SET CURRENT DIRECTION
        DIRECTION = RIGHT

        while len(res) != m * n:
            if DIRECTION == RIGHT:
                # updating columns (j)
                while j < RIGHT_WALL:
                    res.append(matrix[i][j])
                    j += 1
                i, j = i + 1, j - 1
                RIGHT_WALL -= 1
                DIRECTION = DOWN
            elif DIRECTION == DOWN:
                # updating rows
                while i < DOWN_WALL:
                    res.append(matrix[i][j])
                    i += 1
                i, j = i - 1, j - 1
                DOWN_WALL -= 1
                DIRECTION = LEFT
            elif DIRECTION == LEFT:
                while j > LEFT_WALL:
                    res.append(matrix[i][j])
                    j -= 1
                i, j = i - 1, j + 1
                LEFT_WALL += 1
                DIRECTION = UP
            elif DIRECTION == UP:
                while i > UP_WALL:
                    res.append(matrix[i][j])
                    i -= 1
                i, j = i + 1, j + 1
                UP_WALL += 1
                DIRECTION = RIGHT
        return res
