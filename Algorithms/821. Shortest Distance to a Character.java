public class Solution {

    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        int n = -arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == c) n = i;
            arr[i] = i - n;
        }

        n = 2 * arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) n = i;
            arr[i] = Math.min(arr[i], n - i);
        }

        return arr;
    }

}
