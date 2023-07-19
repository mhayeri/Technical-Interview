/**
 * 739. Daily Temperatures
 * Difficulty: Medium
 * Description: Given an array of integers temperatures represents the daily temperatures, return an array
 * answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        // Monotonic decreasing stack for finding next greater element
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            // Stack not empty and the top of the stack is smaller than current temp.
            while (!stack.isEmpty() && (temperatures[stack.peek()] < temperatures[i])) {
                int topIndex = stack.pop();
                res[topIndex] = i - topIndex;
            }
            stack.push(i);
        }

        return res;
    }
}