public class Solution {

    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c : word.toCharArray()) if (isUpperCase(c)) cnt++;

        return cnt == 0 || cnt == word.length() || (cnt == 1 && isUpperCase(word.charAt(0)));
    }

    private static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

}
