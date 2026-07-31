public class Solution {

    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (char c : s.toCharArray()) arr[c]++;

        int sum = 0;
        boolean odd = false;
        for (int i : arr) {
            sum += i / 2 * 2;
            if ((i & 1) == 1) odd = true;
        }

        return sum + (odd ? 1 : 0);
    }

}
