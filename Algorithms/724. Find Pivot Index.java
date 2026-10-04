public class Solution {

    public int pivotIndex(int[] nums) {
        int l = 0, r = 0;
        for (int i : nums) r += i;
        for (int i = 0; i < nums.length; l += nums[i++]) if (l == r - l - nums[i]) return i;

        return -1;
    }

}
