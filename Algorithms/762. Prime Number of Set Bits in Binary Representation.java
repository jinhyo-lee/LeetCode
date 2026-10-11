public class Solution {

    public int countPrimeSetBits(int left, int right) {
        int cnt = 0, mask = 665772;
        for (int i = left; i <= right; i++) if ((mask & (1 << Integer.bitCount(i))) != 0) cnt++;

        return cnt;
    }

}
