public class Solution {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int n = (int) Math.sqrt(num), sum = 1;
        for (int i = 2; i <= n; i++) {
            if (num % i != 0) continue;
            sum += i;
            if (i * i != num) sum += num / i;
        }

        return sum == num;
    }

}
