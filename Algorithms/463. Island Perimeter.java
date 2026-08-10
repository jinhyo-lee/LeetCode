public class Solution {

    public int islandPerimeter(int[][] grid) {
        int sum = 0, y = grid.length, x = grid[0].length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j] == 0) continue;
                sum += 4;
                if (i < y - 1 && grid[i + 1][j] == 1) sum -= 2;
                if (j < x - 1 && grid[i][j + 1] == 1) sum -= 2;
            }
        }

        return sum;
    }

}
