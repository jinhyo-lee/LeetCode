public class Solution {

    public int calPoints(String[] operations) {
        int[] stk = new int[operations.length];
        int top = -1;

        for (String o : operations) {
            switch (o) {
                case "+" -> stk[++top] = stk[top - 1] + stk[top - 2];
                case "D" -> stk[++top] = stk[top - 1] * 2;
                case "C" -> top--;
                default -> stk[++top] = Integer.parseInt(o);
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++) sum += stk[i];

        return sum;
    }

}
