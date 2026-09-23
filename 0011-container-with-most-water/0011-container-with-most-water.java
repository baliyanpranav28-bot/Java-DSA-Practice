class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int fp = 0;
        int lp = height.length-1;
        while(fp < lp){
            int hei = Math.min(height[fp], height[lp]);
            int wei = lp-fp;
            int water = hei * wei;
            maxwater = Math.max(water, maxwater);
            if(height[fp]<height[lp]){
                fp++;
            }else{
                lp--;
            }
        }
        return maxwater;
    }
}