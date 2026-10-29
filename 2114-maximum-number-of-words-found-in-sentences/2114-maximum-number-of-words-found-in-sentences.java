class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String sentence : sentences) {
            int currentWords = 1; 
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    currentWords++;
                }
            }          
            count = Math.max(count, currentWords);
        }      
        return count;
    }
}