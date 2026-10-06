import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowMins = new int[rows];
        int[] colMaxs = new int[cols];
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMins[i] = min;
        }
        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMaxs[j] = max;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int current = matrix[i][j];  
                if (current == rowMins[i] && current == colMaxs[j]) {
                    result.add(current);
                }
            }
        }
        return result;
    }
}