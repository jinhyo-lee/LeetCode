import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) map.put(i, map.getOrDefault(i, 0) + 1);

        int n = map.get(deck[0]);
        for (int i : map.values()) n = gcd(n, i);

        return n > 1;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
