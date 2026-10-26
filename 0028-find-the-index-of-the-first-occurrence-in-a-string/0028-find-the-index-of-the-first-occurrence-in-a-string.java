class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needLen = needle.length();
        
        if (needLen == 0) return 0;
        
        for (int i = 0; i <= hayLen - needLen; i++) {
            int j = 0;
            while (j < needLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needLen) {
                return i;
            }
        }
        return -1;
    }
}