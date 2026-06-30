import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;

        int l = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) continue;
            list.add(getRange(l, nums[i - 1]));
            l = nums[i];
        }
        list.add(getRange(l, nums[nums.length - 1]));

        return list;
    }

    private String getRange(int i, int j) {
        return i != j ? i + "->" + j : String.valueOf(i);
    }

}
