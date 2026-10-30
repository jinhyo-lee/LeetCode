import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        inorder(root1, a);
        inorder(root2, b);

        return a.equals(b);
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if (node.left != null) inorder(node.left, list);
        if (node.right != null) inorder(node.right, list);
    }

}
