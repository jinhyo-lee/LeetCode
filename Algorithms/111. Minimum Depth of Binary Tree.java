public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int l = minDepth(root.left), r = minDepth(root.right);
        return (l != 0 && r != 0 ? Math.min(l, r) : Math.max(l, r)) + 1;
    }

}
