public class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0, r = nums.length - 1, n;
        for (int i = nums.length - 1; i >= 0; i--)
            arr[i] = (n = Math.abs(nums[l]) > Math.abs(nums[r]) ? nums[l++] : nums[r--]) * n;

        return arr;
    }

}
