public class Solution {

    public int strStr(String haystack, String needle) {
        int n = haystack.length() - needle.length() + 1, m = needle.length();
        for (int i = 0; i < n; i++)
            if (haystack.charAt(i) == needle.charAt(0) && compare(haystack, needle, m, i)) return i;

        return -1;
    }

    private boolean compare(String a, String b, int m, int i) {
        for (int j = 1; j < m; j++) if (a.charAt(i + j) != b.charAt(j)) return false;

        return true;
    }

}
