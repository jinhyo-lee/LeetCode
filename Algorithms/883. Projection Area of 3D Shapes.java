public class Solution {

    public int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0, n = grid.length; i < n; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) sum++;
                if (r < grid[i][j]) r = grid[i][j];
                if (c < grid[j][i]) c = grid[j][i];
            }
            sum += r + c;
        }

        return sum;
    }

}
