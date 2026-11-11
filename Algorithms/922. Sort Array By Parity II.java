public class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        int o = 1;
        for (int e = 0; e < nums.length; e += 2) {
            if ((nums[e] & 1) == 0) continue;
            while ((nums[o] & 1) == 1) o += 2;
            int tmp = nums[e];
            nums[e] = nums[o];
            nums[o] = tmp;
        }

        return nums;
    }

}
