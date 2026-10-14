public class Solution {

    private int min = Integer.MAX_VALUE, prev = -1;

    public int minDiffInBST(TreeNode root) {
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
