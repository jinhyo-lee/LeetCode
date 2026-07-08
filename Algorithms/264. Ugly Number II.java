public class Solution {

    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int n2 = arr[i2] * 2, n3 = arr[i3] * 3, n5 = arr[i5] * 5, min = Math.min(n2, Math.min(n3, n5));
            arr[i] = min;
            if (n2 == min) i2++;
            if (n3 == min) i3++;
            if (n5 == min) i5++;
        }

        return arr[n - 1];
    }

}
