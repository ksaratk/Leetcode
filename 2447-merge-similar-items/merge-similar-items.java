class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
       int[] weights = new int[1001];
        
        // Merge items1 into the weights array
        for (int[] item : items1) {
            weights[item[0]] = item[1];
        }
        
        // Merge items2 into the weights array
        for (int[] item : items2) {
            weights[item[0]] += item[1];
        }
        
        // Create the result list from the weights array
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > 0) {
                result.add(Arrays.asList(i, weights[i]));
            }
        }
        return result;
    }
}