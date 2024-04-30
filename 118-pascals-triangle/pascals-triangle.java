class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = null;
        for(int i = 0; i<numRows; i++){
            temp = new ArrayList<>();
            for(int j=0; j<=i; j++){
                int no = ncr(i, j);
                temp.add(no);
            }
            list.add(temp);
        }
        return list;
    }
    
    public int ncr(int n, int r){
        int res = 1;
        
        for(int i = 0; i<r; i++){
             res = res*(n-i);
             res = res/(i+1);
        }
        return res;
    }
}