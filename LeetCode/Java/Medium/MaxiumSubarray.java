/**
 * 53. Maximum Subarray
 * Difficulty: Medium
 * Description: Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 *  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 *  Output: 6
 *  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currentRunningSum = nums[0];
        int maximumSubarraySum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];
            currentRunningSum = Math.max(currentNumber, currentNumber + currentRunningSum);
            maximumSubarraySum = Math.max(maximumSubarraySum, currentRunningSum);
        }

        return maximumSubarraySum;

    }
}