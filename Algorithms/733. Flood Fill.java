public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int cur = image[sr][sc];
        if (cur != color) dfs(image, sr, sc, cur, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int cur, int tgt) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != cur) return;
        image[r][c] = tgt;

        dfs(image, r - 1, c, cur, tgt);
        dfs(image, r + 1, c, cur, tgt);
        dfs(image, r, c - 1, cur, tgt);
        dfs(image, r, c + 1, cur, tgt);
    }

}
