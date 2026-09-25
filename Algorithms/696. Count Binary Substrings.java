public class Solution {

    public int countBinarySubstrings(String s) {
        int sum = 0, prev = 0, cur = 1;
        for (int i = 1, n = s.length(); i < n; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) cur++;
            else {
                sum += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }
        }

        return sum + Math.min(prev, cur);
    }

}
