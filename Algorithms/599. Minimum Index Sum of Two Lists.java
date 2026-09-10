import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);

        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (!map.containsKey(list2[i])) continue;

            int sum = map.get(list2[i]) + i;
            if (sum < min) {
                list.clear();
                list.add(list2[i]);
                min = sum;
            } else if (sum == min) list.add(list2[i]);
        }

        return list.toArray(new String[0]);
    }

}
