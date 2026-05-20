public class Solution {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; digits[i--] = 0) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }

}
