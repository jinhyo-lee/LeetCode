public class Solution {

    private static final boolean[] vowels = new boolean[128];

    static {
        for (char c : "aeiouAEIOU".toCharArray()) vowels[c] = true;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !vowels[arr[l]]) l++;
            while (l < r && !vowels[arr[r]]) r--;

            if (l < r) {
                char c = arr[l];
                arr[l++] = arr[r];
                arr[r--] = c;
            }
        }

        return new String(arr);
    }

}
