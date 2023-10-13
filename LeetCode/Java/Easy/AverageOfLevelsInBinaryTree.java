/**
 * 637. Average of Levels in Binary Tree
 * Difficulty: Easy
 * Description: Given the root of a binary tree, return the average value of the nodes on each level in
 * the form of an array. Answers within 10-5 of the actual answer will be accepted.
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [3.00000,14.50000,11.00000]
 * Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
 * Hence return [3, 14.5, 11].
 *
 * Input: root = [3,9,20,15,7]
 * Output: [3.00000,14.50000,11.00000]
 *
 *
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        // BFS --> Queue
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int qLength = nodes.size(); // divide each level by this
            double sum = 0;

            for (int i = 0; i < qLength; i++) {
                TreeNode curr = nodes.poll();
                if (curr != null) {
                    sum += curr.val;
                    if (curr.left != null) nodes.add(curr.left);
                    if (curr.right != null) nodes.add(curr.right);
                }
            }

            // Calculate the average
            ans.add(sum / qLength);
        }
        return ans;
    }
}