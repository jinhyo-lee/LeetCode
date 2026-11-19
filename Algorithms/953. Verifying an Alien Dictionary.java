public class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        int[] arr = new int[26];
        for (int i = 0, n = order.length(); i < n; i++) arr[order.charAt(i) - 'a'] = i;
        for (int i = 1; i < words.length; i++) if (!isOrdered(words[i - 1], words[i], arr)) return false;

        return true;
    }

    private boolean isOrdered(String a, String b, int[] arr) {
        for (int i = 0, n = Math.min(a.length(), b.length()); i < n; i++) {
            char c = a.charAt(i), d = b.charAt(i);
            if (c != d) return arr[c - 'a'] < arr[d - 'a'];
        }

        return a.length() <= b.length();
    }

}
