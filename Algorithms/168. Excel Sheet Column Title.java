public class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        do sb.append((char) (--columnNumber % 26 + 'A')); while ((columnNumber /= 26) > 0);

        return sb.reverse().toString();
    }

}
