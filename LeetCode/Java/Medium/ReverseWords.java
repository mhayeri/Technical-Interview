
/**
 * 151. Reverse Words in a String
 * Difficulty: Medium
 * Description: Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string
 * should only have a single space separating the words. Do not include any extra spaces.
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 */
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;
            int temp = i;

            while (i >= 0 && s.charAt(i) != ' ') i--;
            ans.append(s.substring(i+1, temp+1)).append(' ');

        }

        return ans.toString().strip();
    }
}
