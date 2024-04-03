class Solution {
    public int dayOfYear(String date) {
        int [] days = new int []{31,28,31,30,31,30,31,31,30,31,30,31};

        String [] ar = date.split("-");
        int year =  Integer.parseInt(ar[0]);
        int month = Integer.parseInt(ar[1]);
        int day =   Integer.parseInt(ar[2]);
        
        int result = day;
        
        for(int i=0; i< month-1; i++){
            result = result + days[i];
        }
        System.out.println(result);

        if(month>2 && year%4 ==0 && (year%400 == 0 || year%100 != 0)){
            result += 1;
        }
        return result;
    }
}