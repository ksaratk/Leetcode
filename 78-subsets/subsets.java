class Solution {
    public List<List<Integer>> subsets(int[] ar) {
		List<List<Integer>> answer = new ArrayList<>();
		answer.add(Arrays.asList());
		
		for(int i=0; i<ar.length; i++){
			List<List<Integer>> list = new ArrayList<>();
			for(int j = 0; j<answer.size(); j++) {
				List<Integer> temp = new ArrayList<>(answer.get(j));
			    temp.add(ar[i]);
			    list.add(temp);
			}
			answer.addAll(list);
		}
        return answer;
    }
}