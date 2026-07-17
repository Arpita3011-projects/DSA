class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int current:asteroids){
            boolean alive=true;
            while(!stack.isEmpty()&& stack.peek()>0 && current<0){
                if(stack.peek()>-current){
                    alive=false;
                    break;

                }else if(stack.peek()==-current){
                   stack.pop();
                    alive=false;
                    break;
                }else{
                    stack.pop();
                    
                }
            }
            if(alive){
                stack.push(current);
            }
            
        }
        int[] ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
        
    }
}