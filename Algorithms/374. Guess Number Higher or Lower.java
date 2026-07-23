public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2, i = guess(m);
            if (i == -1) r = m - 1;
            else if (i == 1) l = m + 1;
            else return m;
        }

        return 0;
    }

}
