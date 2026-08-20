import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public String[] findRelativeRanks(int[] score) {
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < score.length; i++) pq.offer(new int[]{score[i], i});

        String[] arr = new String[score.length];
        int n = 1;
        while (!pq.isEmpty()) {
            int i = pq.poll()[1];
            if (n == 1) arr[i] = "Gold Medal";
            else if (n == 2) arr[i] = "Silver Medal";
            else if (n == 3) arr[i] = "Bronze Medal";
            else arr[i] = String.valueOf(n);
            n++;
        }

        return arr;
    }

}
