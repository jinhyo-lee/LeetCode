public class Solution {

    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0, n = grid.length; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                if (v == 0) continue;
                sum += 4 * v + 2;
                if (i > 0) sum -= 2 * Math.min(v, grid[i - 1][j]);
                if (j > 0) sum -= 2 * Math.min(v, grid[i][j - 1]);
            }
        }

        return sum;
    }

}
