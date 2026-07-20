import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>(), b = new HashSet<>();
        for (int i : nums1) a.add(i);
        for (int i : nums2) if (a.contains(i)) b.add(i);

        int[] arr = new int[b.size()];
        int idx = 0;
        for (int i : b) arr[idx++] = i;

        return arr;
    }

}
