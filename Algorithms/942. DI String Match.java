public class Solution {

    public int[] diStringMatch(String s) {
        int n = s.length(), l = 0, r = n;
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) arr[i] = s.charAt(i) == 'I' ? l++ : r--;
        arr[n] = l;

        return arr;
    }

}
