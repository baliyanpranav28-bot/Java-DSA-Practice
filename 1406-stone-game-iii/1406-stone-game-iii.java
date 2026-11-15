class Solution {
    int n;
    int[] arr;
    public String stoneGameIII(int[] stones) {
        n = stones.length;
        arr = new int[n];
        Arrays.fill(arr, -1);
        int diff = solve(stones, 0);
        if (diff < 0)
            return "Bob";
        else if (diff > 0)
            return "Alice";
        else
            return "Tie";
    }
    private int solve(int[] stones, int i) {
        if (i >= n)
            return 0;
        if (arr[i] != -1)
            return arr[i];
        int result = stones[i] - solve(stones, i + 1);
        if (i + 1 < n)
            result = Math.max(result, stones[i] + stones[i + 1] - solve(stones, i + 2));
        if (i + 2 < n)
            result = Math.max(result, stones[i] + stones[i + 1] + stones[i + 2] - solve(stones, i + 3));
        return arr[i] = result;
    }
}