import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            Integer v = map.get(nums[i]);
            if (map.get(nums[i]) != null) return new int[]{v, i};

            map.put(target - nums[i], i);
        }

        return null;
    }

}
