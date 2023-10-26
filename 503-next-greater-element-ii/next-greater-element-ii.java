class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> stack = new Stack();
      int n = nums.length;
      int [] nge = new int[n];
        int i = (2*n)-1;
        while(i>=0){
            if(stack.isEmpty()){
                stack.push(nums[i%n]);
                nge[i%n] = -1;
                i--;
            } else if(stack.peek()>nums[i%n]){
                int num = nums[i%n];
                nge[i%n] = stack.peek();
                stack.push(num);
                i--;
            } else{
                stack.pop();
            }
        }
        return nge;
    }
}