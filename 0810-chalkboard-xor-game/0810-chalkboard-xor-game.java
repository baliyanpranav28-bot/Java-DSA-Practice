class Solution {
    public boolean xorGame(int[] nums) {
        int result = 0;
        for(int i =0; i<=nums.length-1; i++){
            result ^= nums[i];  
        }
        return result == 0 || nums.length % 2 == 0;
    }
}