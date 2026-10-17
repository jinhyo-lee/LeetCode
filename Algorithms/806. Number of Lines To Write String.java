public class Solution {

    public int[] numberOfLines(int[] widths, String s) {
        int l = 1, w = 0;
        for (char c : s.toCharArray()) {
            int n = widths[c - 'a'];
            if (w + n > 100) {
                l++;
                w = n;
            } else w += n;
        }

        return new int[]{l, w};
    }

}
