public class Solution {

    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1) return -1;

        int[] cnt = new int[n + 1];
        for (int[] arr : trust) {
            cnt[arr[0]]--;
            cnt[arr[1]]++;
        }
        for (int i = 1; i <= n; i++) if (cnt[i] == n - 1) return i;

        return -1;
    }

}
