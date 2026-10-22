import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0, j = 0, n = s.length(); i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (i - j + 1 >= 3) res.add(List.of(j, i));
                j = i + 1;
            }
        }

        return res;
    }

}
