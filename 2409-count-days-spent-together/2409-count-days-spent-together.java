class Solution {
    public int findDayOfYear(String date, int[] MonthDays){
        int month = Integer.parseInt(date.substring(0,2));
        int days = Integer.parseInt(date.substring(3));
        return MonthDays[month-1] + days;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] MonthDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int  arriveAliceDay = findDayOfYear(arriveAlice,MonthDays);
        int  leaveAliceDay = findDayOfYear(leaveAlice,MonthDays);
        int  arriveBobDay = findDayOfYear(arriveBob,MonthDays);
        int  leaveBobDay = findDayOfYear(leaveBob,MonthDays);
        int overlap = Math.min(leaveAliceDay, leaveBobDay) - Math.max(arriveAliceDay, arriveBobDay)+1;
        return Math.max(0,overlap);
    }
}