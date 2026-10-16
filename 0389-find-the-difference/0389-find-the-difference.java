class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        int sumS = 0;
        int sumT = 0;
        for(int i=0; i<n; i++){
            sumS += s.charAt(i);
        }
        for(int i=0; i<m; i++){
            sumT += t.charAt(i);
        }
            return (char) (sumT - sumS);
    }
}