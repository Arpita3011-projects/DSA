class Solution {
    List <String>ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder current=new StringBuilder();
        backtrack(current,0,0,n);
        return ans;
        
    }
    void backtrack(StringBuilder current,int open,int close, int n){
        if(open==n && close==n){
            ans.add(current.toString());
            return;
        }
        if(open<n){
            current.append('(');
            backtrack(current, open+1, close,n);
            current.deleteCharAt(current.length()-1);
        }
        if(close<open){
            current.append(')');
            backtrack(current,open,close+1,n);
            current.deleteCharAt(current.length()-1);

        }
    }
}