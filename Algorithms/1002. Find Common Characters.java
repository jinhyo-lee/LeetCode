import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> commonChars(String[] words) {
        int[] arr = new int[26];
        for (char c : words[0].toCharArray()) arr[c - 'a']++;

        for (int i = 1; i < words.length; i++) {
            int[] cur = new int[26];
            for (char c : words[i].toCharArray()) cur[c - 'a']++;
            for (int j = 0; j < 26; j++) if (arr[j] > cur[j]) arr[j] = cur[j];
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) while (arr[i]-- > 0) list.add(String.valueOf((char) (i + 'a')));

        return list;
    }

}
