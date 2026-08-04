public class Solution {

    public int countSegments(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int cnt = s.charAt(0) != ' ' ? 1 : 0;
        for (int i = 1; i < n; i++) if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') cnt++;

        return cnt;
    }

}
