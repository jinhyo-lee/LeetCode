import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) if (isSelfDividing(i)) list.add(i);

        return list;
    }

    private boolean isSelfDividing(int i) {
        int n = i, d;
        do if ((d = n % 10) == 0 || i % d != 0) return false; while ((n /= 10) > 0);

        return true;
    }

}
