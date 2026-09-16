public class Solution {

    public int[] findErrorNums(int[] nums) {
        int d = -1, m = -1;
        for (int num : nums) {
            int v = Math.abs(num), i = v - 1;
            if (nums[i] < 0) d = v;
            else nums[i] = -nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) continue;
            m = i + 1;
            break;
        }

        return new int[]{d, m};
    }

}
