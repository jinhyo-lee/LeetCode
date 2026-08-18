import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int cur, cnt = 0, max = 0;
    private final List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);

        return arr;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);

        if (node.val == cur) cnt++;
        else {
            cur = node.val;
            cnt = 1;
        }

        if (cnt == max) list.add(node.val);
        else if (cnt > max) {
            max = cnt;
            list.clear();
            list.add(node.val);
        }

        inorder(node.right);
    }

}
