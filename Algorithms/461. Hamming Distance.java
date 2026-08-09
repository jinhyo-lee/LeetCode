public class Solution {

    public int hammingDistance(int x, int y) {
        int cnt = 0, xor = x ^ y;
        while (xor != 0) {
            xor = xor & (xor - 1);
            cnt++;
        }

        return cnt;
    }

    /*public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }*/

}
