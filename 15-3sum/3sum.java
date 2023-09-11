class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
      int n = arr.length;
        List<List<Integer>> list= new ArrayList<>();
       Arrays.sort(arr);
       for(int i=0; i<n; i++){

          if(i!=0 && arr[i]==arr[i-1]) continue;
          int j=i+1;
          int k=n-1;

          while(j<k){
              int sum = arr[i]+arr[j]+arr[k];

              if(sum<0){
                j++;
              }else if(sum>0){
                k--;
              } else{
                List<Integer> tempList =  Arrays.asList(arr[i],arr[j],arr[k]);
                list.add(tempList);
                j++;
                k--;

                while(arr[j]==arr[j-1]&& j<k) j++;
                while(arr[k]==arr[k+1] && j<k) k--;
              }
          }
       }
        return list;
    }
}