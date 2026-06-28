import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Long> set = new HashSet<>();
        long sum = n;
        set.add(sum);
        while (sum != 1) if (!set.add(sum = calc(sum))) return false;

        return true;
    }

    private long calc(long n) {
        long sum = 0;
        do sum += square(n % 10); while ((n /= 10) > 0);

        return sum;
    }

    private long square(long n) {
        return n * n;
    }

}
