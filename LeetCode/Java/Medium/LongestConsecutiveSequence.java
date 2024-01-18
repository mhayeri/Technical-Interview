/**
 * 128. Longest Consecutive Sequence
 * Difficulty: Medium
 * Description: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> counts = new HashSet<>();
        for (int num : nums) counts.add(num);

        for (int num : nums) {
            if (!counts.contains(num - 1)) {
                int curr = 0;
                while (counts.contains(num++)) curr++;
                longest = Math.max(longest, curr);
            }
        }

        return longest;
    }
}
