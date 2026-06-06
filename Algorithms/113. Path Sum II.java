import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        findPathSum(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    public void findPathSum(TreeNode node, int tgt, List<Integer> list, List<List<Integer>> res) {
        if (node == null) return;

        list.add(node.val);
        if (node.left == null && node.right == null && tgt == node.val) res.add(new ArrayList<>(list));

        findPathSum(node.left, tgt - node.val, list, res);
        findPathSum(node.right, tgt - node.val, list, res);
        list.remove(list.size() - 1);
    }

}
