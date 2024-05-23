class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        helper(candidates, ans, index, target, 0, list);
        return ans;
    }
    
    public void helper(int [] cand, List<List<Integer>> ans, int index, int target, int sum,                     List<Integer> list){
        if(sum == target){
            ans.add(new ArrayList(list));
        }
        
        if(sum > target) return;
        
        for(int i= index; i<cand.length; i++){
            if(i>index && cand[i]==cand[i-1]) continue;
            sum += cand[i];
            list.add(cand[i]);
            helper(cand, ans, i+1, target, sum, list);
            sum -= cand[i];
            list.remove(list.size()-1);
        }
    }
}