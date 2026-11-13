import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String a = s.substring(0, s.indexOf('@'));
            StringBuilder sb = new StringBuilder();
            for (char c : a.toCharArray()) {
                if (c == '.') continue;
                if (c == '+') break;
                sb.append(c);
            }
            set.add(sb + s.substring(a.length()));
        }

        return set.size();
    }

}
