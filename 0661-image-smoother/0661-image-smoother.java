class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        int[][] direction = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
                { 1, 1 } };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int k = 0; k < 9; k++) {
                    int row = i + direction[k][0];
                    int col = j + direction[k][1];
                    if (row >= 0 && row < m && col >= 0 && col < n) {
                        sum += img[row][col];
                        count++;
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}