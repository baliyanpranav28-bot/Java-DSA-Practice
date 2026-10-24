class Solution {
    public boolean halvesAreAlike(String s) {
        // String vowels = "aeiouAEIOU";
        // int n = s.length();
        // int Count = 0;
        // for (int i = 0; i < n / 2; i++) {
        //     if (vowels.indexOf(s.charAt(i)) != -1) {
        //         Count++;
        //     }
        // } 
        // for (int i = n / 2; i < n; i++) {
        //     if (vowels.indexOf(s.charAt(i)) != -1) {
        //         Count--;
        //     }
        // }  
        // return Count == 0;
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);
        String vowels = "aeiouAEIOU";
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                countA++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                countB++;
            }
        }
        return countA == countB;
    }
}