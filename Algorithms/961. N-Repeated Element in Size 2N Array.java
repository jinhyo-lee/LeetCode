import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length / 2 + 1);
        for (int i : nums) if (!set.add(i)) return i;

        return -1;
    }

}
