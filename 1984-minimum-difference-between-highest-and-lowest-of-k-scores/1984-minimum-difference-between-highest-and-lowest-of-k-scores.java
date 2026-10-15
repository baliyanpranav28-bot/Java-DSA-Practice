class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(k == 1){
            return 0;
        }
        int mini = Integer.MAX_VALUE;
        for(int i= 0; i<n-1; i++){
            for(int j =0; j<n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <= n - k; i++) {
        int diff = nums[i + k - 1] - nums[i];
        mini = Math.min(mini, diff);

    }
        return mini;

    }
}