public class Solution {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        repeat('M', num / 1000, sb);
        num %= 1000;

        measure('C', 'D', 'M', num / 100, sb);
        num %= 100;

        measure('X', 'L', 'C', num / 10, sb);
        num %= 10;

        measure('I', 'V', 'X', num, sb);

        return sb.toString();
    }

    private void measure(char cur, char mid, char next, int i, StringBuilder sb) {
        if (i == 0) return;

        if (i < 4) repeat(cur, i, sb);
        else if (i == 4) sb.append(cur).append(mid);
        else if (i < 9) repeat(cur, i - 5, sb.append(mid));
        else sb.append(cur).append(next);
    }

    private void repeat(char c, int i, StringBuilder sb) {
        while (i-- > 0) sb.append(c);
    }

}
