class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int nevcount = 0;
        int posCount = 0;
        for(int i = 0; i<=n-1; i++){
            if(nums[i]>0){
                posCount++;
            }else if(nums[i]<0){
                nevcount ++;
            }else{

            }
        }
        int res = Math.max(nevcount,posCount);
        return res;
    }
}