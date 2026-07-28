import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        if (turnedOn > 8) return list;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) != turnedOn) continue;
                sb.append(i).append(':');
                if (j < 10) sb.append('0');
                sb.append(j);
                list.add(sb.toString());
                sb.setLength(0);
            }
        }

        return list;
    }

}
