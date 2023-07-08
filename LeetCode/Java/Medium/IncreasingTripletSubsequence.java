
/**
 * 334. Increasing Triplet Subsequence
 * Difficulty: Medium
 * Description: Given an integer array nums, return true if there exists a triple of indices (i, j, k)
 * such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 *
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 */
public class ReverseWords {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int number : nums) {
            if (number <= first) first = number;
            else if (number <= second) second = number;
            else return true;
        }
        return false;
    }
}
