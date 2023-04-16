/**
 * 108. Convert Sorted Array to Binary Search Tree
 * Difficulty: Easy
 * Description: Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 *
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted
 *
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 *
 */
public class SortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length - 1);
    }

    private TreeNode sorted(int[] nums, int left, int right) {
        if (left > right) return null;

        int middle = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sorted(nums, left, middle - 1);
        root.right = sorted(nums, middle + 1, right);

        return root;
    }
}