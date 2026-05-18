public class Solution {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m = r >> 1;
        while (l <= r) {
            if (target <= nums[m]) r = m - 1;
            else l = m + 1;
            m = (r + l) >> 1;
        }

        return l;
    }

}
