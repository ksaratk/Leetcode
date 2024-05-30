class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> list = new ArrayList<>();
   // Arrays.sort(nums); // not necessary
        boolean [] ar= new boolean[nums.length];
   backtrack(list, new ArrayList<>(), nums, ar);
   return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] ar){
   if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
       return;
   } 
      for(int i= 0; i < nums.length; i++){ 
         if(ar[i] && tempList.contains(nums[i])) continue; // element already exists, skip
         ar[i] = true;
          tempList.add(nums[i]);
         backtrack(list, tempList, nums, ar);
         tempList.remove(tempList.size() - 1);
          ar[i] = false;
      }
   } 
}