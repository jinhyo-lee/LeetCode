public class Solution {

    public int romanToInt(String s) {
        int[] arr = {0, 0, 100, 500, 0, 0, 0, 0, 1, 0, 0, 50, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};

        int sum = arr[s.charAt(s.length() - 1) - 'A'];
        for (int i = s.length() - 2; i >= 0; i--)
            sum = arr[s.charAt(i + 1) - 'A'] > arr[s.charAt(i) - 'A'] ? sum - arr[s.charAt(i) - 'A'] : sum + arr[s.charAt(i) - 'A'];

        return sum;
    }

}
