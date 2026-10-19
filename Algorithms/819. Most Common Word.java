import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        Matcher mat = Pattern.compile("[a-z]+").matcher(paragraph.toLowerCase());
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String res = "";
        int max = 0;
        while (mat.find()) {
            String s = mat.group();
            if (set.contains(s)) continue;
            int cnt = map.getOrDefault(s, 0) + 1;
            map.put(s, cnt);
            if (max < cnt) {
                max = cnt;
                res = s;
            }
        }

        return res;
    }

}
