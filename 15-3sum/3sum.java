class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
       Arrays.sort(nums);
       int n = nums.length;
       for(int i=0; i<nums.length; i++){

            if(i>0 && nums[i-1]==nums[i]) continue;
           int j = i+1;
           int k = n-1;

           while(j<k){
               int sum = nums[i]+nums[j]+nums[k];

               if(sum>0){
                 k--;
               } else if(sum<0){
                   j++;
               } else{
                   List<Integer> tempList = Arrays.asList(nums[i],nums[j],nums[k]);
                   tempList.sort(null);
                   set.add(tempList);
                    k--;
                    j++;

                    while(nums[j]==nums[j-1] && j<k) j++;
                    while(nums[k]==nums[k+1] && j<k) k--;
               }
           }
       }
       List<List<Integer>> list = new ArrayList<>(set);
       return list;
    }
}