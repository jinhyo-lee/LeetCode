public class Solution {

    public int binaryGap(int n) {
        int max = 0;
        for (int i = 0, j = -1; n > 0; i++, n >>= 1) {
            if ((n & 1) == 0) continue;
            if (j != -1) max = Math.max(max, i - j);
            j = i;
        }

        return max;
    }

}
