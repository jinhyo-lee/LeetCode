public class Solution {

    int min = Integer.MAX_VALUE, prev = -1;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        if (prev != -1) min = Math.min(min, node.val - prev);
        prev = node.val;

        inorder(node.right);
    }

}
