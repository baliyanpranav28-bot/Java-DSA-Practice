class Solution {
    public boolean isGoodArray(int[] nums) {
        int result = nums[0];
        int n = nums.length;
        for(int i =1; i<n; i++){
            result = gcd(result, nums[i]);
        }
        if(result == 1){
            return true;
        }
        return result == 1;
    }
    private int gcd(int a, int b){
            if(b == 0){
                return a;
            }
            return gcd(b, a%b);
        }
}