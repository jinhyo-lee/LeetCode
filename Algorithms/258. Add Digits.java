public class Solution {

    public int addDigits(int num) {
        while (num > 9) num = calc(num);

        return num;
    }

    private int calc(int n) {
        int sum = 0;
        do sum += n % 10; while ((n /= 10) > 0);

        return sum;
    }

}
