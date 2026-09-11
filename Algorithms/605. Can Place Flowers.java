public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && n > 0) {
            if (flowerbed[i] == 1) i += 2;
            else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                i += 2;
                n--;
            } else i += 3;
        }

        return n <= 0;
    }

}
