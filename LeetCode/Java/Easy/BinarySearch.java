/**
 * 704. Binary Search
 * Difficulty: Easy
 * Description: Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, target, nums);
    }

    private int binarySearch(int left, int right, int target, int[] nums) {
        if (left > right) return -1;
        int middle = left + (right - left) / 2;
        if (nums[middle] == target) return middle;

        if (nums[middle] > target) return binarySearch(0, middle - 1, target, nums);
        return binarySearch(middle + 1, right, target, nums);
    }
}