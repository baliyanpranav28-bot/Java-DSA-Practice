class Solution {
    public int[][] generateMatrix(int n) {
        int[][] Matrix = new int[n][n];
        int startrow = 0;
        int startcol = 0;
        int endrow = Matrix.length-1; 
        int endcol = Matrix[0].length-1;
        int count = 1;
        while(startrow <= endrow && startcol <= endcol){
           //print top
           for(int j=startcol; j<=endcol; j++){
            Matrix[startrow][j] = count;
            count++;
           } 
           //print right
           for(int i = startrow+1; i<=endrow; i++){
            Matrix[i][endcol] = count;
            count++;
           }
           //print bottom
           for(int j = endcol-1; j>=startcol; j--){
            if(startrow == endrow){
                break;
            }
            Matrix[endrow][j] = count;
            count++;
           }
           //print left
           for(int i = endrow-1; i>=startrow+1; i--){
            if(startcol == endcol){
                break;
            }
            Matrix[i][startcol] = count;
            count++;
           }
           startrow++;
           startcol++;
           endrow--;
           endcol--;
        
        }
         return Matrix;

    }
}