import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> pq;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>(k);

        for (int num : nums) add(num);
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) pq.poll();

        return pq.element();
    }

}
