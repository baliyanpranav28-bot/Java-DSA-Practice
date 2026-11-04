class Solution {
    public int countSegments(String s) {
        String[] str = s.trim().split("\\s+");
        if(s.trim().isEmpty()) return 0;
        int count = 0;
        for(String word : str){
            count++;
        }
        return count;
    }
}