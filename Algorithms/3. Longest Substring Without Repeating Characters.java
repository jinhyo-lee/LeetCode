public class Solution {

    public int lengthOfLongestSubstring(String s) {
        boolean[] arr = new boolean[256];
        int r = 0, l = 0, max = 0, n = s.length();
        while (r < n) {
            if (!arr[s.charAt(r)]) {
                arr[s.charAt(r++)] = true;
                max = Math.max(max, r - l);
            } else arr[s.charAt(l++)] = false;
        }

        return max;
    }

}
