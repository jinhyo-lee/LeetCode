public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') continue;
            if (cnt > 0 && cnt % k == 0) sb.append('-');
            sb.append(c >= 'a' && c <= 'z' ? (char) (c - 32) : c);
            cnt++;
        }

        return sb.reverse().toString();
    }

}
