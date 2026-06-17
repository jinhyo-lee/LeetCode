import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        int n = nums.length / 2;
        for (Entry<Integer, Integer> entry : map.entrySet()) if (entry.getValue() > n) return entry.getKey();

        return -1;
    }

}
