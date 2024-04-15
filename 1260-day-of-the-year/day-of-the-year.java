class Solution {
    int [] months = {31,28,31,30,31,30,31,31,30,31,30,31}; 
    public int dayOfYear(String date) {
        String [] ar = date.split("-");
        int year = Integer.parseInt(ar[0]);
        int month = Integer.parseInt(ar[1]);
        int days = Integer.parseInt(ar[2]);

        int day = days;
        if(month>2 && year%4 == 0 && (year%400 ==0 || year%100 != 0)){
            day = day+1;
        }
        for(int i=0; i<month-1; i++){
            day += months[i];
        }
        return  day;
    }
}