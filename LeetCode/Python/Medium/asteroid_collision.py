#
#   735. Asteroid Collision
#   Difficulty: Medium
#   Description: We are given an array asteroids of integers representing asteroids in a row. For each asteroid, the
#   absolute value represents its size, and the sign represents its direction (positive meaning right, negative
#   meaning left). Each asteroid moves at the same speed.
#
#   Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If
#   both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
#
#
#   Input: asteroids = [5,10,-5]
#   Output: [5,10]
#   Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

#   Input: asteroids = [8,-8]
#   Output: []
#   Explanation: The 8 and -8 collide exploding each other.
#
#   Input: asteroids = [10,2,-5]
#   Output: [10]
#   Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
#

from typing import List


class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []
        for asteroid in asteroids:
            add = True
            while stack and stack[-1] > 0 and asteroid < 0:
                if abs(stack[-1]) < abs(asteroid):  # current asteroid destroys top
                    stack.pop()
                    continue
                elif abs(stack[-1]) == abs(asteroid):  # both asteroids are destroyed
                    stack.pop()

                add = False
                break
            if add:
                stack.append(asteroid)

        return stack
