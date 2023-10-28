class StockSpanner {
    List<Integer> list = null;
    public StockSpanner() {
       list  = new ArrayList();
    }
    
    public int next(int price) {
       int count = 0;
       list.add(price);
       count++;

       int index = list.lastIndexOf(price);
       for(int i = index; i>0; i--){
          if(list.get(i-1)<=price){
             count++;
          }else{
             break;
          }
       }
       return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */