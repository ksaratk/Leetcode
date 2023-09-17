class RandomizedSet {
    Set<Integer> s = null;
    public RandomizedSet() {
      s = new HashSet<>();
    }
    
    public boolean insert(int val) {
      return s.add(val);  
    } 
    
    public boolean remove(int val) {
      return  s.remove(val);
    }
    
    public int getRandom() {
    List<Integer> list = new ArrayList<Integer>(s);
       int r=(int)(Math.random()*s.size());
        
       return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */