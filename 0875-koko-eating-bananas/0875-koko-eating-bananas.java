class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // find midspeed
        int minspeed = 1;
        // find maxspeed
        int max = 0;
        for(int i=0; i<=piles.length-1; i++){
            int currsum = piles[i];
            max = Math.max(max,currsum);
        }
        //binary search
        while(minspeed < max){
        int mid = (minspeed + max)/2;
        if(canieat(piles,h,mid)){
            max = mid;
        }else{
            minspeed = mid+1;
        }
        
        }
        return minspeed;
    }
        //fn create
        private boolean canieat(int[] piles, int h, int speed){
            int hours = 0;
            for(int i=0; i<=piles.length-1; i++){
                hours += (int)Math.ceil((double)piles[i]/speed);
            }
            return hours <= h;
        }
    
}