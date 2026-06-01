import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int lvl = 0;
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            while (size-- > 0) {
                TreeNode node = q.remove();
                if ((lvl & 1) == 0) list.add(node.val);
                else list.add(0, node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            res.add(list);
            lvl++;
        }

        return res;
    }

}
