class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int weekStart = 1; 
        int dailyMoney = 1;
        for (int day = 1; day <= n; day++) {
            totalMoney += dailyMoney;
            dailyMoney++; 
            if (day % 7 == 0) {
                weekStart++;         
                dailyMoney = weekStart; 
            }
        }
        
        return totalMoney;
    }
}