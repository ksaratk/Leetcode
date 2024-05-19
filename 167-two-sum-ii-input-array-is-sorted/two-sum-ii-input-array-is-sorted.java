class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        int sum = 0;
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            sum = numbers[i] + numbers[j];
            if(sum > target) j--;
            else if(sum < target) i++;
            else{
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }
                return ans;
    }
}