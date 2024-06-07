#
#   238. Product of Array Except Self
#   Difficulty: Medium
#   Description: Given an integer array nums, return an array answer such that answer[i] is equal to the
#   product of all the elements of nums except nums[i].
#
#   The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
#
#   You must write an algorithm that runs in O(n) time and without using the division operation.
#
#   Input: nums = [1,2,3,4]
#   Output: [24, 12, 8, 6]
#

from typing import List


class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        for i in range(1, len(nums)):
            res[i] = res[i - 1] * nums[i - 1]

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]

        return res
