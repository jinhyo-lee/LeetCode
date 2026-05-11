public class Solution {

    public String longestCommonPrefix(String[] strs) {
        int min = 200;
        for (String s : strs) min = Math.min(min, s.length());

        for (int i = 0; i < min; i++)
            for (int j = 1; j < strs.length; j++)
                if (strs[0].charAt(i) != strs[j].charAt(i)) return strs[0].substring(0, i);

        return strs[0].substring(0, min);
    }

}
