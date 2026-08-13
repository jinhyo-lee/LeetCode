public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cnt = 0;
        for (int i : nums) {
            if (i == 0) {
                max = Math.max(max, cnt);
                cnt = 0;
            } else cnt++;
        }

        return Math.max(max, cnt);
    }

}
