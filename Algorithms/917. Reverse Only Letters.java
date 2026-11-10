public class Solution {

    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && isNotLetter(arr[l])) l++;
            while (l < r && isNotLetter(arr[r])) r--;
            if (l < r) {
                char tmp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = tmp;
            }
        }

        return new String(arr);
    }

    private boolean isNotLetter(char c) {
        return (c < 'A' || c > 'Z') && (c < 'a' || c > 'z');
    }

}
