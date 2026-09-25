class Solution {
    public void moveZeroes(int[] nums) {
        int  size = nums.length;
        if(size == 0 || size == 1){
            return;
        }
        int nonzero = 0;
        int zero = 0;
        while(nonzero < size){
            if(nums[nonzero] != 0){
                //swapping
                int temp = nums[nonzero];
                nums[nonzero] = nums[zero];
                nums[zero] = temp;
                nonzero++;
                zero++;
            }else{
                nonzero++;
            }
        }
        }
    }