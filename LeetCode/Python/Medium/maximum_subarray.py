#
#   53. Maximum Subarray
#   Difficulty: Medium
#   Description: Given an integer array nums, find a subarray that has the largest sum, and return its sum.
#
#   Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
#   Output: 6
#   Explanation: The subarray [4,-1,2,1] has the largest sum 6.
#
#   Input: nums = [1]
#   Output: 1
#   Explanation: The subarray [1] has the largest sum 1.
#

from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        _max, run = nums[0], nums[0]

        for i in range(1, len(nums)):
            run = max(nums[i], nums[i] + run)
            _max = max(_max, run)

        return _max
