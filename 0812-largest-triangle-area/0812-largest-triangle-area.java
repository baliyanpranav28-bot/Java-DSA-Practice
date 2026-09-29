class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxarea = 0.0;
        int n = points.length;
        //first point
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
         //second point
          for (int j = i+1; j < n; j++) {
              int x2 = points[j][0];
              int y2 = points[j][1];
            //third point
              for (int k = j+1; k < n; k++) {
                int x3 = points[k][0];
                int y3 = points[k][1];
                double currentArea = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                maxarea = Math.max(currentArea, maxarea);
               }
           }
        }
        return maxarea;
    }

}