import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();

        dq.offer(root);
        while (!dq.isEmpty()) {
            int size = dq.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = dq.removeFirst();
                sum += node.val;
                if (node.left != null) dq.offer(node.left);
                if (node.right != null) dq.offer(node.right);
            }
            list.add(sum * 1.0 / size);
        }

        return list;
    }

}
