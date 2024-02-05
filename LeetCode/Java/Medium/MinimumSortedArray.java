/**
 * 153. Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Description: Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 *
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 */
public class MinimumSortedArray {
    public int findMin(int[] nums) {
        // Single element array - return first element
        if (nums.length == 1) return nums[0];
        int low = 0, high = nums.length - 1;

        // To check if a rotation occurred in the first place
        if (nums[high] > nums[low]) return nums[low];

        while (low < high) {
            int middle = low + (high - low) / 2;
            // Middle number is greater than the number next to it --> Makes middle+1 the smallest number
            if (nums[middle] > nums[middle+1]) return nums[middle+1];

            // Middle number is smaller than the number before it --> Makes middle the smallest number
            if (nums[middle] < nums[middle-1]) return nums[middle];

            if (nums[middle] > nums[low]) low = middle + 1;
            else high = middle - 1;
        }

        return -1;
    }
}
