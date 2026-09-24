class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newarr = new int[2*n];
         int count = 0;
        for(int i=0; i<n; i++){
        newarr[count] = nums[i];
        newarr[count+1] = nums[n+i];
        count += 2;
        }
        return newarr;
    }
}