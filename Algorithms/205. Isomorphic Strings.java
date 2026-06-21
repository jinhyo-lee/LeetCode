import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char k = s.charAt(i), v = t.charAt(i);
            if (map.containsKey(k)) {
                if (map.get(k) != v) return false;
            } else {
                if (map.containsValue(v)) return false;
                map.put(k, v);
            }
        }

        return true;
    }

}
