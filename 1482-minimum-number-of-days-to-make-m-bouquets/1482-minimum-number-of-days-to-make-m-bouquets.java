class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //check out of boundry case
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        // find max or min
        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        int ans = -1;
        // Binary search on the number of days
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;       
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int consecutiveFlowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                consecutiveFlowers++;
                if (consecutiveFlowers == k) {
                    bouquets++;
                    consecutiveFlowers = 0; 
                }
            } else {
                consecutiveFlowers = 0; 
            }
            if (bouquets >= m) {
                return true;
            }
        }      
        return bouquets >= m;
    }
}