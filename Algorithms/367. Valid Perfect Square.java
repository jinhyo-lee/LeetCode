public class Solution {

    public boolean isPerfectSquare(int num) {
        return Math.sqrt(num) % 1 == 0;
    }

    /*public boolean isPerfectSquare(int num) {
        long l = 0, r = num;
        while (l <= r) {
            long m = l + (r - l) / 2, sq = m * m;
            if (sq == num) return true;
            else if (sq < num) l = m + 1;
            else r = m - 1;
        }

        return false;
    }*/

}
