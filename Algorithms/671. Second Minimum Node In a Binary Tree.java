public class Solution {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) return -1;
        int l = root.val == root.left.val ? findSecondMinimumValue(root.left) : root.left.val, r = root.val == root.right.val ? findSecondMinimumValue(root.right) : root.right.val;

        return l != -1 && r != -1 ? Math.min(l, r) : Math.max(l, r);
    }

}
