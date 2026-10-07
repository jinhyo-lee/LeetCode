public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1, i = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (letters[m] > target) {
                r = m - 1;
                i = m;
            } else l = m + 1;
        }

        return i == -1 ? letters[0] : letters[i];
    }

}
