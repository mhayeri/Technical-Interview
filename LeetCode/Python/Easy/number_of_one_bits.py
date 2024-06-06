#
#   191. Number of 1 Bits
#   Difficulty: Easy
#   Description: Write a function that takes the binary representation of a positive integer and returns the number of
#   set bits it has (also known as the Hamming weight).
#
#   The test cases are generated so that the answer will fit in a 32-bit integer.
#
#   Input: n = 11
#   Output: 3
#   Explanation: The input binary string 1011 has a total of three set bits.
#
#   Input: n = 128
#   Output: 1
#   Explanation: The input binary string 10000000 has a total of one set bit.
#


class Solution:
    def hammingWeight(self, n: int) -> int:
        res = 0
        while n:
            res += n % 2
            n = n >> 1
        return res
