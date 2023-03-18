/**
 * 409. Longest Palindrome
 * Difficulty: Easy
 * Description: Given a string s which consists of lowercase or uppercase letters, return the length of
 * the longest palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is 1.
 *
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int palindromeLength = 0;
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            if (letterCounts.get(c) % 2 == 0) palindromeLength += 2;
        }

        if (palindromeLength != s.length()) return palindromeLength + 1;
        return palindromeLength;
    }
}