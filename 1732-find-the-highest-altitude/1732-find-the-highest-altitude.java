class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 0; i < n; i++) {
            result[i + 1] = result[i] + gain[i];
        }
        Arrays.sort(result);
        return result[n]; 
    }
}