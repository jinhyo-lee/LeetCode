public class Solution {

    public String toHex(int num) {
        if (num == 0) return "0";

        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        do sb.append(arr[num & 15]); while ((num >>>= 4) != 0);

        return sb.reverse().toString();
    }

}
