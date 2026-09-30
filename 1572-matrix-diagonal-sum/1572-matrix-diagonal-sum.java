class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<=n-1; i++){
            sum += mat[i][i];//primary diagonal sum
            if(i != n-i-1){
                sum += mat[i][n-i-1];//secondary sum
            }
        }
        return sum;
    }
}