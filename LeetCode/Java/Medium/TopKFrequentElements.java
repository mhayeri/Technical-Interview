/**
 * 347. Top K Frequent Elements
 * Difficulty: Medium
 * Description: Given an integer array nums and an integer k, return the k most frequent elements. You may
 * return the answer in any order.
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 Input: nums = [1], k = 1
 Output: [1]
 *
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // Store the counts of each element in the list.
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) counts.put(num, counts.getOrDefault(num, 0) + 1);

        // Make a bucket array that is the same length as input, nums.
        List<List<Integer>> bucket = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length + 1; i++) {
            bucket.add(new ArrayList<>());
        }

        // Add the element to the corresponding bucket frequency.
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            bucket.get(value).add(key);
        }

        // Generate the array with the K most frequent elements.
        List<Integer> res = new ArrayList<>();
        for (int i = bucket.size() - 1; i > 0; i--) {
            for (int n : bucket.get(i)) {
                res.add(n);
                if (res.size() == k) {
                    return listToIntArray(res);
                }
            }
        }

        return new int[k];
    }

    // Helper function to convert ArrayList to Array.
    private static int[] listToIntArray(List<Integer> list) {
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
        return intArray;
    }
}