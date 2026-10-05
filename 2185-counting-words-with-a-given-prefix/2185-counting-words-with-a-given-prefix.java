class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<=words.length-1; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
            
        }
        return count;
    }
}