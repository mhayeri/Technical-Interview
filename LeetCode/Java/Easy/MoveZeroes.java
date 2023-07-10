/**
 * 283. Move Zeroes
 * Difficulty: Easy
 * Description: Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                swap(slow, fast, nums);
                slow++;
                fast++;
            }
        }
    }

    public void swap (int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}