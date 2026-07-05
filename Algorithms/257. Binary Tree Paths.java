import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, new StringBuilder(), list);

        return list;
    }

    public void dfs(TreeNode node, StringBuilder sb, List<String> list) {
        int n = sb.length();
        sb.append(node.val);

        if (node.left == null && node.right == null) list.add(sb.toString());
        else {
            sb.append("->");
            if (node.left != null) dfs(node.left, sb, list);
            if (node.right != null) dfs(node.right, sb, list);
        }
        sb.setLength(n);
    }

}
