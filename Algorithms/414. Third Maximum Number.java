public class Solution {

    public int thirdMax(int[] nums) {
        long i = Long.MIN_VALUE, j = Long.MIN_VALUE, k = Long.MIN_VALUE;
        for (int n : nums) {
            if (n == i || n == j || n == k) continue;
            if (n > i) {
                k = j;
                j = i;
                i = n;
            } else if (n > j) {
                k = j;
                j = n;
            } else if (n > k) k = n;
        }

        return k == Long.MIN_VALUE ? (int) i : (int) k;
    }

    /*public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) set.pollFirst();
        }

        return set.size() == 3 ? set.first() : set.last();
    }*/

}
