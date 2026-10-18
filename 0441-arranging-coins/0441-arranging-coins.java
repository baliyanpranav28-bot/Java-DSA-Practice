class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long currentCoins = mid * (mid + 1) / 2;
            
            if (currentCoins == n) {
                return (int) mid;
            }
            if (currentCoins > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }
}