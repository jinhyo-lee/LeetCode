public class Solution {

    public boolean judgeCircle(String moves) {
        int y = 0, x = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U' -> y++;
                case 'D' -> y--;
                case 'L' -> x--;
                case 'R' -> x++;
                default -> {
                }
            }
        }

        return y == 0 && x == 0;
    }

}
