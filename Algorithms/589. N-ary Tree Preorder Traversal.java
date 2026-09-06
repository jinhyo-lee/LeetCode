import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);

        return list;
    }

    private void dfs(Node node) {
        if (node == null) return;

        list.add(node.val);
        for (Node child : node.children) dfs(child);
    }

}
