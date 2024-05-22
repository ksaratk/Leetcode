class Solution {
    public int subsetXORSum(int[] arr) {
      int[] ans = new int[1];
        helper(arr, 0, 0, ans);
        return ans[0];
    }

    public void helper(int[] arr, int index, int currentXOR, int[] ans) {
        ans[0] += currentXOR; // Add the current XOR sum to the answer
        
        // Iterate through the array to generate subsets
        for (int i = index; i < arr.length; i++) {
            // Calculate the XOR of the current element with the current XOR sum
            int newXOR = currentXOR ^ arr[i];
            // Recur for the next element with the updated XOR sum
            helper(arr, i + 1, newXOR, ans);
        }
    }
}