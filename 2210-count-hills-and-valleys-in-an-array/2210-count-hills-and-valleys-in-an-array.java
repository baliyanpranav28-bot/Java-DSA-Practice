class Solution {
    public int countHillValley(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i] == a[i - 1]) {
                continue;
            }
            int j = i - 1;
            int k = i + 1;
            while (j >= 0 && a[i] == a[j])
                j--;
            while (k < n && a[i] == a[k])
                k++;
            if (j >= 0 && k < n) {
                if (a[i] < a[j] && a[i] < a[k]) {
                    count++;
                } else if (a[i] > a[j] && a[i] > a[k]) {
                    count++;
                }
            }
        }
        return count;
    }
}