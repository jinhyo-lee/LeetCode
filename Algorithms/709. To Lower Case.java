public class Solution {

    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) if (arr[i] > 64 && arr[i] < 91) arr[i] |= 32;

        return new String(arr);
    }

}
