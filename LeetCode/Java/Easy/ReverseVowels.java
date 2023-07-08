
/**
 * 345. Reverse Vowels of a String
 * Difficulty: Easy
 * Description: Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Input: s = "hello"
 * Output: "holle"
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            while (start < s.length() && !isVowel(chars[start])) start++;
            while (end >= 0 && !isVowel(chars[end])) end--;
            if (start < end) swap(chars, start++, end--);
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
