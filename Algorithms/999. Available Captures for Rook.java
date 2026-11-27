public class Solution {

    public int numRookCaptures(char[][] board) {
        int y = 0, x = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    y = i;
                    x = j;
                }
            }
        }

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int cnt = 0;
        for (int[] d : dir) {
            int ny = y + d[0], nx = x + d[1];
            while (ny >= 0 && ny < 8 && nx >= 0 && nx < 8) {
                if (board[ny][nx] == 'B') break;
                if (board[ny][nx] == 'p') {
                    cnt++;
                    break;
                }
                ny += d[0];
                nx += d[1];
            }
        }

        return cnt;
    }

}
