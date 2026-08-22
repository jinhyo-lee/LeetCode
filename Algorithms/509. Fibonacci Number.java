public class Solution {

    public int fib(int n) {
        int i = 0, j = 1;
        while (n-- > 0) {
            int sum = i + j;
            i = j;
            j = sum;
        }

        return i;
    }

}
