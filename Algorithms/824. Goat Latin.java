public class Solution {

    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!isVowel(arr[i].charAt(0))) sb.append(arr[i].substring(1)).append(arr[i].charAt(0));
            else sb.append(arr[i]);
            sb.append("ma").repeat("a", i + 1).append(' ');
        }

        return sb.toString().trim();
    }

    private boolean isVowel(char c) {
        return (c = Character.toLowerCase(c)) == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
