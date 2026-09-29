class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int last = nums.length-1;
        while(start < last){
            int mid = (start+last)/2;
            if(nums[mid+1] > nums[mid]){
                start = mid+1;
            }else{
                last = mid;
            }
        }
        return start;
    }
}