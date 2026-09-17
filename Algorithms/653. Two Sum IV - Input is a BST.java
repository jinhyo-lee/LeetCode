import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<Integer> set = new HashSet<>();
    int tgt;

    public boolean findTarget(TreeNode root, int k) {
        tgt = k;
        return dfs(root);
    }

    private boolean dfs(TreeNode node) {
        if (node == null) return false;

        if (set.contains(tgt - node.val)) return true;
        set.add(node.val);

        return dfs(node.left) || dfs(node.right);
    }

}
