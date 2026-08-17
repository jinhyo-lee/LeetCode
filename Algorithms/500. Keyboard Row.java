import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String map = "12210111011122000010020202";

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) if (isSameRow(word)) list.add(word);

        return list.toArray(new String[0]);
    }

    private boolean isSameRow(String word) {
        char tgt = map.charAt((word = word.toLowerCase()).charAt(0) - 'a');
        for (char c : word.toCharArray()) if (tgt != map.charAt(c - 'a')) return false;

        return true;
    }

}
