class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;  
        long start = 1;
        long last = num / 2;     
        while (start <= last) {
            long mid = start + (last - start) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1; 
            } else {
                last = mid - 1; 
            }
        }
        return false;
    }
}