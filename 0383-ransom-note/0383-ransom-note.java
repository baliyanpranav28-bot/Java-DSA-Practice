class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int[] freq = new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for(char cha:ransomNote.toCharArray()){
            freq[cha-'a']--;
            if(freq[cha - 'a']<0){
                return false;
            }
        }
        return true;

    }
}