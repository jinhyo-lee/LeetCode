public class Solution {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length - 1;
        while (i < n) i += bits[i] == 0 ? 1 : 2;

        return i == n;
    }

}
