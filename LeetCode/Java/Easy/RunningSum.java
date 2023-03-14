
/**
 * 1480. Running Sum of 1D Array
 * Difficulty: Easy
 * Description: Given an array nums, we define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i]).
 * Return the returning sum of nums.
 *
 *  Input: [1, 2, 3, 4]
 *  Output: [1, 3, 6, 10]
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i-1];
        }

        return result;
    }

}
