class Solution {
    int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceA = getTotalDays(arriveAlice);
        int aliceL = getTotalDays(leaveAlice);
        int bobA = getTotalDays(arriveBob);
        int bobL =  getTotalDays(leaveBob);
        if(aliceL<bobA || bobL<aliceA) return 0;
        int result = ( Math.min(aliceL, bobL) - Math.max(aliceA, bobA));
        return result+1;
    }

    public int getTotalDays(String date){
        String [] ar = date.split("-");
        int month = Integer.parseInt(ar[0]);
        int days = Integer.parseInt(ar[1]);
        for(int i = 0; i<month-1; i++){
            days += months[i];
        }
        return days;
    }
}