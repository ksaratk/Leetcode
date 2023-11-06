class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = null; 
        for(int row = 1; row<=numRows; row++){
            temp = new ArrayList();
            for(int col = 1; col<=row; col++){
                int res = ncR(row-1, col-1);
                temp.add(res);
            }
            list.add(temp);
        }
        return list;
    }

     public int ncR(int n, int r){
            int res = 1;

            for(int i=0; i<r; i++){
                res = res*(n-i);
                res = res/(i+1);
            }
            return res;
        }
}