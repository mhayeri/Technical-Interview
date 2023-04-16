/**
 * 169. Majority Element
 * Difficulty: Easy
 * Description: Given an array nums of size n, return the majority element. The majority element is the element
 * that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2.
 *
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = Integer.MIN_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > maxFreq) {
                maxFreq = freq.get(num);
                majority = num;
            }
        }

        return majority;
    }
}