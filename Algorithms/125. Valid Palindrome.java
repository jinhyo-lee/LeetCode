public class Solution {

    public boolean isPalindrome(String s) {
        s = preprocess(s);
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return true;
    }

    private String preprocess(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || c >= 'a' && c <= 'z') sb.append(c);
            else if (c >= 'A' && c <= 'Z') sb.append((char) (c + 32));
        }

        return sb.toString();
    }

}
