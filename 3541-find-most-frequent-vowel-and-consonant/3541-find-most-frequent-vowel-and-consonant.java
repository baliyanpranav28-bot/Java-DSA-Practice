class Solution {
    public int maxFreqSum(String s) {
        int[] ans = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
        }
        int vo = 0, co = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vo = Math.max(vo, ans[i]);
            } else {
                co = Math.max(co, ans[i]);
            }
        }
        return vo + co;
    }
}