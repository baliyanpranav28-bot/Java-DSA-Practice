class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i =0; i<n-1; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j<n; j++){
                int diff = nums[j] - nums[i];
                if(diff == k){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}