class Solution {
        int [] daysArray  = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arriveA = getDays(arriveAlice);
        int arriveB = getDays(arriveBob);
        int leaveA  = getDays(leaveAlice);
        int leaveB  = getDays(leaveBob);
       System.out.print(arriveA +" "+arriveB +" "+leaveA+" "+leaveB);
        if(leaveB < arriveA || leaveA < arriveB) return 0;

        int arrive = Math.max(arriveA, arriveB);
        int leave = Math.min(leaveB, leaveA);

        return Math.abs(arrive - leave)+1;
    }

     public int getDays(String x){
        int days = 0;
        String [] date = x.split("-");
        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);

        days = day;
        for(int i=0; i<month-1; i++){
            days += daysArray[i];
        }
        return days;
     }
}