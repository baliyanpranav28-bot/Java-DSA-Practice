class Solution {
    private int Sqrt(long x) {
        if (x == 0 || x == 1) {
            return (int) x;
        }
        long left = 1;
        long right = x;
        long ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2; 
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
    public int arrangeCoins(int n) {
        long m = (long) n;
        return (int) (Sqrt(8 * m + 1) - 1) / 2;
    }
}
