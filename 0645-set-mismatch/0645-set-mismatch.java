class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int num : nums) {
                if (num == i) {
                    count++;
                }
            } 
            if (count == 2) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        } 
        return new int[] { duplicate, missing };
    }
}