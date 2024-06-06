#
#   152. Maximum Product Subarray
#   Difficulty: Medium
#   Description: Given an integer array nums, find a subarray that has the largest product, and return the product.
#
#   The test cases are generated so that the answer will fit in a 32-bit integer.
#
#   Input: nums = [2,3,-2,4]
#   Output: 6
#   Explanation: [2,3] has the largest product 6.
#
#   Input: nums = [-2,0,-1]
#   Output: 0
#   Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
#
#

from typing import List


class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        max_so_far, min_so_far = nums[0], nums[0]
        res = max_so_far

        for i in range(1, len(nums)):
            curr = nums[i]
            temp_max = max(curr, curr * max_so_far, curr * min_so_far)
            min_so_far = min(curr, curr * max_so_far, curr * min_so_far)

            max_so_far = temp_max
            res = max(res, max_so_far)

        return res
