public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode l, TreeNode r) {
        if (l == null || r == null) return l == r;
        return l.val == r.val && isSymmetricTree(l.left, r.right) && isSymmetricTree(l.right, r.left);
    }

}
