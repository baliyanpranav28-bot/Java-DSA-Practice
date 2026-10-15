class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-1-i; j++){
                //swapping
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                }
                 

            }
        }
        int mulMax = nums[n-1]*nums[n-2]*nums[n-3];
        int mulMin = nums[0]*nums[1]*nums[n-1];
        return Math.max(mulMax,mulMin);
    }
}