public class Solution {

    public int findLUSlength(String[] strs) {
        int max = -1;
        for (int i = 0, j; i < strs.length; i++) {
            for (j = 0; j < strs.length; j++) {
                if (i == j) continue;
                if (isSubsequence(strs[i], strs[j])) break;
            }
            if (j == strs.length) max = Math.max(max, strs[i].length());
        }

        return max;
    }

    private boolean isSubsequence(String a, String b) {
        int i = 0, n = a.length();
        for (int j = 0, m = b.length(); i < n && j < m; j++) if (a.charAt(i) == b.charAt(j)) i++;

        return i == n;
    }

}
