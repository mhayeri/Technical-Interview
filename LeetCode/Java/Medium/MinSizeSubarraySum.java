/**
 * 209. Minimum Size Subarray Sum
 * Difficulty: Medium
 * Description: Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */

public class MinSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, minimumLength = Integer.MAX_VALUE, currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            while (currentSum >= target) {
                minimumLength = Math.min(minimumLength, i - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        if (minimumLength > nums.length) return 0;
        return minimumLength;
    }
}