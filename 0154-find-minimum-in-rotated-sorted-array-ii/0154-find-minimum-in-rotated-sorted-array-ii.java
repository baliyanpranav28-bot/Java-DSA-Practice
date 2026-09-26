class Solution {
    public int findMin(int[] nums) {
        int n = nums[0];//let minimum
        for(int i =0; i<=nums.length-1; i++){
            if(nums[i]<n){
                n = nums[i];
            }
        }
        return n;
    }
}