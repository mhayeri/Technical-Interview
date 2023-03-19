/**
 * 102. Binary Tree Level Order Traversal
 * Difficulty: Medium
 * Description: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 * Input: root = [1]
 * Output: [[1]]
 *
 * Input: root = []
 * Output: []
 *
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);

        while (!treeNodes.isEmpty()) {
            int qLength = treeNodes.size();
            List<Integer> vals = new ArrayList<>();
            for (int i = 0; i < qLength; i++) {
                TreeNode curr = treeNodes.poll();
                if (curr != null) {
                    vals.add(curr.val);
                    treeNodes.add(curr.left);
                    treeNodes.add(curr.right);
                }
            }
            if (vals.size() > 0) ans.add(vals);
        }
        return ans;
    }
}