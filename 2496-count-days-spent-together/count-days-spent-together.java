class Solution {
    private static final int[] Date_before_month = {
        0,0,31,59,90,120,151,181,212,243,273,304,334
    };
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startAlice = getDateofYear(arriveAlice);
        int endAlice = getDateofYear(leaveAlice);
        int startBob = getDateofYear(arriveBob);
        int endBob = getDateofYear(leaveBob);

        int overlapStart = Math.max(startAlice,startBob);
        int overlapEnd = Math.min(endAlice,endBob);

        if(overlapStart <= overlapEnd){
            return overlapEnd - overlapStart + 1;
        }

        return 0;
    }
    private int getDateofYear(String dateStr){
        int month = Integer.parseInt(dateStr.substring(0,2));
        int date = Integer.parseInt(dateStr.substring(3,5));
        return Date_before_month[month]+date;
    }
}