class Solution {
    public int alternatingSum(int[] a) {
        int sum = 0;
        int n = a.length;
        for(int i=0; i<n; i++) {
            if(i % 2 == 0){
                sum += a[i];
            }
            else sum -= a[i];
        }
        return sum;
    }
}