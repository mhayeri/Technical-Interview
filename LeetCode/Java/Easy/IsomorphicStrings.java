/**
 * 205. Isomorphic Strings
 * Difficulty: Easy
 * Description: Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if
 * the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character
 * while preserving the order of the character. No two characters may map to the same character, but a character may
 * map to itself
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            // Checks if the letters in 'S' map directly to 'T'
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}