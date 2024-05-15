class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        helper(ans, list, sum, target, candidates, 0);
        return ans;
    }
    
    public void helper(List<List<Integer>> ans, List<Integer> list, int sum, int target, int[] ar, int start){
        if(sum == target ){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        if(sum>target){
            return;
        }
        
        for(int i = start; i<ar.length; i++){
            if(i>0 && ar[i] == ar[i-1]) continue;
            sum += ar[i];
            list.add(ar[i]);
            helper(ans, list, sum, target, ar, i);
            sum -= ar[i];
            list.remove(list.size()-1);
        }
    }
}