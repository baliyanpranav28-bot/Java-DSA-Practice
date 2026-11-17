class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                int sum = 0;
                for(int ni = Math.max(0,i-k); ni <= Math.min(m-1,i+k); ni++){
                    for(int nj = Math.max(0,j-k); nj <= Math.min(n-1,j+k); nj++){
                        sum += mat[ni][nj];
                    }
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}