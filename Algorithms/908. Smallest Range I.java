public class Solution {

    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = min;
        for (int i : nums) {
            if (min > i) min = i;
            if (max < i) max = i;
        }

        return Math.max(0, max - min - 2 * k);
    }

}
