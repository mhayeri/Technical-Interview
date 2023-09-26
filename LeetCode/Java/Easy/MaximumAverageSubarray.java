/**
 * 643. Maximum Average Subarray I
 * Difficulty: Easy
 * Description: You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return
 * this value. Any answer with a calculation error less than 10-5 will be accepted.
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 *
 */
public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double slidingWindow = 0;
        // Gets the sum of sliding window length k
        for (int i = 0; i < k; i++) slidingWindow += nums[i];

        double ans = slidingWindow;
        for (int i = k; i < nums.length; i++) {
            // Update slidingWindow
            slidingWindow += nums[i] - nums[i-k];
            ans = Math.max(ans, slidingWindow);
        }

        return ans / k;
    }
}