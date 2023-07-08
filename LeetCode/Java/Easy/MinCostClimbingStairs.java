/**
 * 746. Min Cost Climbing Stairs
 * Difficulty: Easy
 * Description: You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 *
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: You will start at index 1.
 * - Pay 15 and climb two steps to reach the top.
 * The total cost is 15.
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        for (int i = 2; i < minCost.length; i++) {
            int oneStep = minCost[i - 1] + cost[i - 1];
            int twoStep = minCost[i - 2] + cost[i - 2];
            minCost[i] = Math.min(oneStep, twoStep);
        }

        return minCost[minCost.length - 1];
    }
}