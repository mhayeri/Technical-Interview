#
#   739. Daily Temperatures
#   Difficulty: Medium
#   Description: Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number #   of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 #   instead.

#   Input: temperatures = [73,74,75,71,69,72,76,73]
#   Output: [1, 1, 4, 2, 1, 1, 0, 0]

#   Input: temperatures = [30,40,50,60]
#   Output: [1, 1, 1, 0]

from typing import List


class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        stack = []

        for idx, temp in enumerate(temperatures):
            while stack and temp > stack[-1][0]:
                stack_temp, stack_idx = stack.pop()
                res[stack_idx] = idx - stack_idx
            stack.append((temp, idx))

        return res
