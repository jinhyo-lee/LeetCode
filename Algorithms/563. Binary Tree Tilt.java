public class Solution {

    int sum = 0;

    public int findTilt(TreeNode root) {
        sum(root);
        return sum;
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;

        int l = sum(node.left), r = sum(node.right);
        sum += Math.abs(l - r);

        return l + r + node.val;
    }

}
