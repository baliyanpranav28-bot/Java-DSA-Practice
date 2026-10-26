class Solution {
    int m, n;

    long dfs(int i, int j, int[][] grid) {
        long sum = grid[i][j];
        grid[i][j] = 0;
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d];
            int nj = j + dy[d];
            if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] > 0) {
                sum += dfs(ni, nj, grid);
            }
        }
        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = dfs(i, j, grid);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}