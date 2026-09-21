public class Solution {

    public int findLengthOfLCIS(int[] nums) {
        int max = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) max = Math.max(max, ++cur);
            else cur = 1;
        }

        return max;
    }

}
