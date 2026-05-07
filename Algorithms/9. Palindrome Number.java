public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int sum = 0, n = x;
        do sum = sum * 10 + n % 10; while ((n /= 10) > 0);

        return x == sum;
    }

}
