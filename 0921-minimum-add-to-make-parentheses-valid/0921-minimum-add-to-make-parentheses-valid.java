class Solution {
    public int minAddToMakeValid(String s) {
        int openmatched = 0;
        int closematched = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openmatched++; 
            } else {
                if (openmatched > 0) {
                    openmatched--; 
                } else {
                    closematched++; 
                }
            }
        }
        return openmatched + closematched;
    }
}