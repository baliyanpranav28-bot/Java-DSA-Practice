class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n =  timeSeries.length;
        int count = 0;
        for(int i =0; i<n-1; i++){
            int diff = timeSeries[i+1] - timeSeries[i];
            count += Math.min(diff,duration);
        }
        if(n>0){
            count += duration;
        }
        return count;
    }
}