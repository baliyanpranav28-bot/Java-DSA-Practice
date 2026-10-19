class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<=nums.length-1; i++){
            for(int j = i+1; j<=nums.length-1; j++){
                int diff = Math.abs(nums[j] - nums[i]);
                if(diff == k){
                    count++;
                }
            }
        }
        return count;
    }
}