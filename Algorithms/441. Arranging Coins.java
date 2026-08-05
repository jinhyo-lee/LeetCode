public class Solution {

    public int arrangeCoins(int n) {
        long l = 0, r = n;
        while (l <= r) {
            long m = l + (r - l) / 2, k = m * (m + 1) / 2;
            if (k == n) return (int) m;
            if (n < k) r = m - 1;
            else l = m + 1;
        }

        return (int) r;
    }

    /*public int arrangeCoins(int n) {
        int i = 1;
        while (n >= i) n -= i++;

        return i - 1;
    }*/

}
