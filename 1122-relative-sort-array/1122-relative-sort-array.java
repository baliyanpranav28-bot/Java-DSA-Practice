class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }   
        int[] result = new int[arr1.length];
        int idx = 0;

        for (int num : arr2) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }
        // 2. Place elements (not in arr2)ascending 
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[idx++] = i;
                count[i]--;
            }
        }
        return result;
    }
}