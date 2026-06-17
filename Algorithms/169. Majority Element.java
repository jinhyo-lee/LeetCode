import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        for (int k : nums) {
            int v = map.getOrDefault(k, 0) + 1;
            if (v > n) return k;
            map.put(k, v);
        }

        return -1;
    }

}
