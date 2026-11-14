import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    private final Queue<Integer> q;

    public RecentCounter() {
        this.q = new ArrayDeque<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (q.element() < t - 3000) q.poll();

        return q.size();
    }
}
