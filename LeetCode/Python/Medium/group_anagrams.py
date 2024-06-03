# /**
#  * 49. Group Anagrams
#  * Difficulty: Medium
#  * Description: Given an array of strings strs, group the anagrams together. You can return the answer in any order.
#  *
#  * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically
#  * using all the original letters exactly once.
#  *
#  * Input: strs = ["eat","tea","tan","ate","nat","bat"]
#  * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
#  *
#  *
#  * Input: strs = [""]
#  * Output: [[""]]
#  *
#  * Input: strs = ["a"]
#  * Output: [["a"]]
#  */

from typing import List
from collections import defaultdict


class GroupAnagrams:
    def groupanagrams(self, strs: List[str]) -> List[List[str]]:
        ans = defaultdict(list)

        for s in strs:
            key = [0] * 26
            for c in s:
                key[ord(c) - ord("a")] += 1

            key = tuple(key)
            ans[key].append(s)

        return ans.values()
