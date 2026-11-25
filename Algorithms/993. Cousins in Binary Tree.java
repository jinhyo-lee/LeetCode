public class Solution {

    private TreeNode xp, yp;
    private int xd = -1, yd = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, 0, x, y);

        return xd == yd && xp != yp;
    }

    private void dfs(TreeNode node, TreeNode parent, int d, int x, int y) {
        if (node == null || (xd != -1 && yd != -1)) return;

        if (node.val == x) {
            xp = parent;
            xd = d;
        } else if (node.val == y) {
            yp = parent;
            yd = d;
        }

        dfs(node.left, node, d + 1, x, y);
        dfs(node.right, node, d + 1, x, y);
    }

}
