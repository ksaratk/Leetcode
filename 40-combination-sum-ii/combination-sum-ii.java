class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int index = 0;
        int sum = 0;
        List<Integer> temp = new ArrayList<>();
        helper(candidates, ans, index, sum, temp, target);
        return ans;    
    }
    
    public void helper(int [] candidates, List<List<Integer>> ans, int index, int sum, List<Integer> temp, int target){
        if(sum == target){
            ans.add(new ArrayList(temp));
            return;
        }
        
        if(sum>target){
            return;
        }
        
        for(int i = index; i<candidates.length; i++){
            if(i!=index && candidates[i]==candidates[i-1]) continue;
            
            sum += candidates[i];
            temp.add(candidates[i]);
            helper(candidates, ans, i+1,  sum, temp,  target);
            sum -= candidates[i];
            temp.remove(temp.size()-1);
        }
    }
}