class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for(int i=0; i<asteroids.length; i++){
            if(stack.isEmpty() || asteroids[i]>0){
                stack.add(asteroids[i]);
            } else{
                while(!stack.isEmpty()){
                if(stack.peek()<0){
                    stack.add(asteroids[i]);
                    break;
                } 
                int num = Math.abs(asteroids[i]);
                    if(num<stack.peek()){
                        break;
                    } else if(num==stack.peek()){
                        stack.pop();
                        break;
                    } else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.add(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int n = stack.size();
        int[] ansArray = new int[n];
        for(int j = n-1; j>=0; j--){
            ansArray[j] = stack.pop();
        }
        return ansArray;
    }
}