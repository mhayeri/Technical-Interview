/**
 * 136. Single Number
 * Difficulty: Easy
 * Description: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Input: nums = [2,2,1]
 * Output: 1
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        for (int j = 0; j < nums.length; j++) {
            if (counts.get(nums[j]) == 1) return nums[j];
        }

        return -999;
    }
}