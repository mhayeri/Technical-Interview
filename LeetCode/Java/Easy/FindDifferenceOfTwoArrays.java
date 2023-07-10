/**
 * 2215. Find the Difference of Two Arrays
 * Difficulty: Easy
 * Description: Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 *
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present
 * in nums2. Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present
 * in nums2. Therefore, answer[1] = [4,6].
 */
public class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getUniqueList(nums1, nums2), getUniqueList(nums2, nums1));
    }

    private List<Integer> getUniqueList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInFirst = new HashSet<>();
        Set<Integer> valuesInSecond = new HashSet<>();

        for (int n : nums2) valuesInSecond.add(n);
        for (int n : nums1) {
            if (!valuesInSecond.contains(n)) onlyInFirst.add(n);
        }

        return new ArrayList<>(onlyInFirst);
    }
}