/**
 * 20. Valid Parentheses
 * Difficulty: Easy
 * Description: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine
 * if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Input: s = "()"
 * Output: true
 *
 * Input: s = "()[]{}"
 * Output: true
 *
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') parentheses.push(c);
            else {
                if (parentheses.isEmpty()) return false;
                if (!isMatch(c, parentheses.peek())) return false;
                parentheses.pop();
            }
        }

        return parentheses.isEmpty();
    }

    public boolean isMatch(char c1, char c2) {
        return (c1 == ')' && c2 == '(') || (c1 == '}' && c2 == '{') || (c1 == ']' && c2 == '[');
    }
}