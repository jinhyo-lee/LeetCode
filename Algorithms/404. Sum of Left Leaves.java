public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        if (root.left != null)
            sum += root.left.left == null && root.left.right == null ? root.left.val : sumOfLeftLeaves(root.left);

        return sum + sumOfLeftLeaves(root.right);
    }

}
