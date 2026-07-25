class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }else{
                int sum=0;
                while(!stack.isEmpty() && stack.peek()!=0){
                    sum=sum+stack.pop();
                }
                stack.pop();
                int score;
                if(sum==0){
                    score=1;
                }else{
                    score=2*sum;
                }
                stack.push(score);

            }

        }
        int ans=0;
        while(!stack.isEmpty()){
            ans=ans+stack.pop();
        }
        return ans;

        
    }
}