#
#   347. Top K Elements
#   Difficulty: Medium
#   Description: Given an integer array nums and an integer k, return the k most frequent elements.
#   You may return the answer in any order.
#
#   Input: nums = [1,1,1,2,2,3], k = 2
#   Output: [1, 2]
#
#   Input: nums = [1], k = 1
#   Output: [1]
#

from typing import List, defaultdict


class Solution:

    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = defaultdict(int)
        for num in nums:
            freq[num] += 1

        buckets = [[] for _ in range(len(nums) + 1)]
        for key, value in freq.items():
            buckets[value].append(key)

        res = []
        for i in range(len(buckets) - 1, 0, -1):
            for n in buckets[i]:
                res.append(n)
                if len(res) == k:
                    return res

        return []
