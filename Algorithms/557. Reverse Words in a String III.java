public class Solution {

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0, j = 0; j <= arr.length; j++) {
            if (j != arr.length && arr[j] != ' ') continue;
            reverse(arr, i, j - 1);
            i = j + 1;
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char c = arr[i];
            arr[i++] = arr[j];
            arr[j--] = c;
        }
    }

}
