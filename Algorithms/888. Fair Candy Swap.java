import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        for (int i : aliceSizes) a += i;

        Set<Integer> set = new HashSet<>();
        for (int i : bobSizes) {
            b += i;
            set.add(i);
        }

        int n = (b - a) / 2;
        for (int i : aliceSizes) {
            int j = i + n;
            if (set.contains(j)) return new int[]{i, j};
        }

        return new int[0];
    }

}
