class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int row = m - 1; // Start at bottom row
        int col = 0;     // Start at first column
        
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                // This number and everything to its right are negative
                count += (n - col);
                row--; // Move up
            } else {
                col++; // Move right
            }
        }
        
        return count;
    }
}