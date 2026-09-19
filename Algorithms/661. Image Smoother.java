public class Solution {

    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] mat = new int[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int sum = 0, cnt = 0;
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        if (i < 0 || i >= n || j < 0 || j >= m) continue;
                        sum += img[i][j];
                        cnt++;
                    }
                }
                mat[r][c] = sum / cnt;
            }
        }

        return mat;
    }

}
