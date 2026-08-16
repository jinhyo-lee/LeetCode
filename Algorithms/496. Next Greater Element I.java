import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i : nums2) {
            while (!dq.isEmpty() && dq.peek() < i) map.put(dq.pop(), i);
            dq.push(i);
        }

        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) arr[i] = map.getOrDefault(nums1[i], -1);

        return arr;
    }

}
