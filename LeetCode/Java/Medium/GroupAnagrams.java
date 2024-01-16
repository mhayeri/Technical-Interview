/**
 * 49. Group Anagrams
 * Difficulty: Medium
 * Description: Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically
 * using all the original letters exactly once.
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 *
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            // Create a character counter
            int[] counts = new int[26];

            // Loop through each char in s and update counts: [2, 1, 0, 0, ...]
            for (int i = 0; i < s.length(); i++) counts[s.charAt(i) - 'a']++;

            // Generate the key for the map
            StringBuilder sb = new StringBuilder();
            char currentLetter = 'a';

            for (int i = 0; i < 26; i++) {
                sb.append(counts[i]);
                sb.append(currentLetter++);
            }

            String key = sb.toString();
            if (!anagrams.containsKey(key)) anagrams.put(key, new ArrayList<String>());
            anagrams.get(key).add(s);
        }

        return new ArrayList(anagrams.values());
    }
}