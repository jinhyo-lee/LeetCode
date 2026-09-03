public class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat[0].length, l = r * c;
        if (mat.length * n != l) return mat;

        int[][] res = new int[r][c];
        for (int i = 0; i < l; i++) res[i / c][i % c] = mat[i / n][i % n];

        return res;
    }

}
