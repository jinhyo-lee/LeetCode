public class Solution {

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1, a = 0, b = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    a++;
                    i--;
                } else if (a > 0) {
                    a--;
                    i--;
                } else break;
            }

            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    b++;
                    j--;
                } else if (b > 0) {
                    b--;
                    j--;
                } else break;
            }

            if ((i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) || i-- >= 0 != j-- >= 0) return false;
        }

        return true;
    }

}
