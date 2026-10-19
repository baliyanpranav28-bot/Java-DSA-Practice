class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int idx1 = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                idx1 = mid;
                j = mid - 1;
            }
        }
        int idx2 = -1;
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                idx2 = mid;
                i = mid + 1;

            }
        }
        return new int[] { idx1, idx2 };
    }
}