public class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] tgt = getFrequency(licensePlate);
        String s = null;
        for (String word : words) if ((s == null || word.length() < s.length()) && isCompleting(tgt, word)) s = word;

        return s;
    }

    private int[] getFrequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toLowerCase().toCharArray()) if (c >= 'a' && c <= 'z') freq[c - 'a']++;

        return freq;
    }

    private boolean isCompleting(int[] tgt, String word) {
        int[] freq = getFrequency(word);
        for (int i = 0; i < 26; i++) if (freq[i] < tgt[i]) return false;

        return true;
    }

}
