import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int i : nums) arr[i] = true;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) if (!arr[i]) list.add(i);

        return list;
    }

}
