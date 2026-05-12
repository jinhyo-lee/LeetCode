public class Solution {

    public boolean isValid(String s) {
        char[] stk = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stk[top++] = c;
            else if (Math.abs(c - stk[--top]) > 2) return false;
        }

        return top == 1;
    }

}
