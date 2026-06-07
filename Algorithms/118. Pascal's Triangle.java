import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows > 0) res.add(List.of(1));
        if (numRows > 1) res.add(List.of(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>(), prev = res.get(i - 1);
            cur.add(1);
            for (int j = 1; j < i; j++) cur.add(prev.get(j - 1) + prev.get(j));
            cur.add(1);
            res.add(cur);
        }

        return res;
    }

}
