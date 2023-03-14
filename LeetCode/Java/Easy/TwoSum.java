import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * Difficulty: Easy
 * Description: Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they add up to target. You may assume that each input would have exactly one solution, and you may not use the same
 * element twice. You can return the answer in any order.
 *
 *  Input: [2, 7, 11, 15], target = 9
 *  Output [0, 1]
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (values.containsKey(diff)) {
                return new int[]{values.get(diff), i};
            }
            values.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
