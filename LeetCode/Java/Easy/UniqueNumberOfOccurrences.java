/**
 * 1207. Unique Number of Occurrences
 * Difficulty: Easy
 * Description: Given an array of integers arr, return true if the number of occurrences of each value
 * in the array is unique or false otherwise.
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>();
        for (Integer n : counts.keySet()) {
            if (frequencies.contains(counts.get(n))) return false;
            frequencies.add(counts.get(n));
        }

        return true;

    }
}