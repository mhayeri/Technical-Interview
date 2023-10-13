/**
 * 199. Binary Tree Right Side View
 * Difficulty: Medium
 * Description: Given the root of a binary tree, imagine yourself standing on the right side of it, return the
 * values of the nodes you can see ordered from top to bottom.
 *
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 *
 * Input: root = [1,null,3]
 * Output: [1,3]
 *
 * Input: root = []
 * Output: []
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();

        Deque<TreeNode> nodes = new ArrayDeque();
        List<Integer> rightSide = new ArrayList<>();

        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int qLength = nodes.size();
            for (int i = 0; i < qLength; i++) {
                TreeNode node = nodes.poll();
                if (i == qLength - 1) rightSide.add(node.val);
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
        }

        return rightSide;
    }
}
