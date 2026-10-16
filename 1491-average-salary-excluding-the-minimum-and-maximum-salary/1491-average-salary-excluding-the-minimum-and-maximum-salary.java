class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double sum = 0;
        int count = 0;
        for(int i=1; i<=n-2; i++){
            sum += salary[i];
            count++;
        }
        return sum/count;
    }
}