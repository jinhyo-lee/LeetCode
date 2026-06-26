import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = q.size() - 1; i > 0; i--) q.add(q.remove());
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

}
