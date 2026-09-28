class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                int length = j - i + 1;
                if (length % 2 != 0) {
                    totalSum += currentSum; 
                }
            }
        }
        return totalSum;
    }
}