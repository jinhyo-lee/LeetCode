public class Solution {

    public int findShortestSubArray(int[] nums) {
        int n = 0;
        for (int num : nums) if (num > n) n = num;

        int[] cnt = new int[n + 1], anc = new int[n + 1];
        int max = 0, len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (++cnt[num] == 1) anc[num] = i;

            if (cnt[num] > max) {
                max = cnt[num];
                len = i - anc[num] + 1;
            } else if (cnt[num] == max) len = Math.min(len, i - anc[num] + 1);
        }

        return len;
    }

}
