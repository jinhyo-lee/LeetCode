import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);

        return list;
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;

        dfs(node.left, list);
        dfs(node.right, list);
        list.add(node.val);
    }

}
