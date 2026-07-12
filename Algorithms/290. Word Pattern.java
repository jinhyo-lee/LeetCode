import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char k = pattern.charAt(i);
            String v = arr[i];
            if (!map.containsKey(k)) {
                if (set.contains(v)) return false;
                map.put(k, v);
                set.add(v);
            } else if (!map.get(k).equals(v)) return false;
        }

        return true;
    }

}
