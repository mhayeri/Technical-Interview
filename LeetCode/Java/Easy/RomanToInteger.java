/**
 * 13. Roman to Integer
 * Difficulty: Easy
 * Description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same
 * principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger{
    public int romanToInt(String s) {
        int integerValue = 0;
        Map<Character, Integer> values = createValuesMap();
        int i = s.length() - 1;

        while (i >= 0) {
            char current = s.charAt(i);
            if (current == 'M' || current == 'D') {
                if (i - 1 >= 0 && s.charAt(i-1) == 'C') {
                    integerValue += values.get(current) - values.get('C');
                    i -= 2;
                } else {
                    integerValue += values.get(current);
                    i -= 1;
                }
            } else if (current == 'C' || current == 'L') {
                if (i - 1 >= 0 && s.charAt(i-1) == 'X') {
                    integerValue += values.get(current) - values.get('X');
                    i -= 2;
                } else {
                    integerValue += values.get(current);
                    i -= 1;
                }
            } else if (current == 'V' || current == 'X') {
                if (i - 1 >= 0 && s.charAt(i-1) == 'I') {
                    integerValue += values.get(current) - values.get('I');
                    i -= 2;
                } else {
                    integerValue += values.get(current);
                    i -= 1;
                }
            } else {
                integerValue += values.get(current);
                i--;
            }
            
        }

        return integerValue;
    }

    private Map<Character, Integer> createValuesMap() {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        return values;
    }
}