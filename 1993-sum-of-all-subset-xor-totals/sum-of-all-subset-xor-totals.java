class Solution {
    public int subsetXORSum(int[] arr) {
      int[] ans = new int[1];
        helper(arr, 0, 0, ans);
        return ans[0];
    }

    public void helper(int[] arr, int index, int currentXOR, int[] ans) {
        ans[0] += currentXOR; // Add the current XOR sum to the answer
        
        for (int i = index; i < arr.length; i++) {
            int newXOR = currentXOR ^ arr[i];
            helper(arr, i + 1, newXOR, ans);
            
        }
    }
}