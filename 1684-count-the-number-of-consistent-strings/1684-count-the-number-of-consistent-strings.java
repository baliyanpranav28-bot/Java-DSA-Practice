class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!isAllowed[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }      
        return count;
    }
}