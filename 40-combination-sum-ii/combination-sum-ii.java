class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array
        helper(new ArrayList<>(), candidates, target, 0, 0, result);
        return result;
    }

    public static void helper(List<Integer> list, int[] candidates, int target, int start, int sum, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates
            }
            list.add(candidates[i]);
            helper(list, candidates, target, i + 1, sum + candidates[i], result);
            list.remove(list.size() - 1);
        }
    }
}
