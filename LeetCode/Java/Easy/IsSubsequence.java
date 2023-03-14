/**
 * 392. Is Subsequence
 * Difficulty: Easy
 * Description: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
 * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */
class StringSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int sIndex = 0;
        for (int i = 0; i < t.length() && sIndex < s.length(); i++) {
            if (t.charAt(i) == s.charAt(sIndex)) sIndex++;
        }
        return sIndex == s.length();
    }
}