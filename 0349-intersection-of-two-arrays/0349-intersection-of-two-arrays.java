class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int[] arr = new int[Math.min(nums1.length, nums2.length)];
       int count = 0;
       for(int i=0; i<=nums1.length-1; i++){
        for(int j =0; j<=nums2.length-1; j++){
            if(nums1[i]== nums2[j]){
                boolean exists = false;
                    for(int k = 0; k < count; k++){
                        if(arr[k] == nums1[i]){
                            exists = true;
                            break;
                        }
                    }
                    
                    if(!exists){
                        arr[count] = nums1[i];
                        count++;
                    }
                }
            }
        }
        return Arrays.copyOf(arr, count);

    }
   
}
