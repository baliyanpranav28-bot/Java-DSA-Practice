class Solution {
    public int largestInteger(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int a = nums[i] - '0';
                int b = nums[j] - '0';
                if(a % 2 == b % 2 && nums[i]<nums[j]){
                    char temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return Integer.parseInt(new String(nums));
    }
}