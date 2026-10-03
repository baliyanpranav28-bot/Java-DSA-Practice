class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq  = new int[26];
        for(int i=0; i<=s.length()-1; i++){
            int idx = s.charAt(i)-'a';
            freq[idx]++;
        }
        for(int i=0; i<=t.length()-1; i++){
            int idx = t.charAt(i)-'a';
            freq[idx]--;
        }
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}