/**
 * 217. Contains Duplicate
 * Difficulty: Easy
 * Description: Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            if (values.contains(num)) return true;
            values.add(num);
        }

        return false;
    }
}