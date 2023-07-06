/**
 * 1768. Merge Strings Alternately
 * Difficulty: Easy
 * Description: You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int w1 = 0, wordOneLength = word1.length(), w2 = 0, wordTwoLength = word2.length();
        StringBuilder ans = new StringBuilder();

        while (w1 < word1.length() || w2 < word2.length()) {
            if (w1 < wordOneLength) {
                ans.append(word1.charAt(w1));
                w1++;
            }
            if (w2 < wordTwoLength) {
                ans.append(word2.charAt(w2));
                w2++;
            }
        }

        return ans.toString();
    }
}