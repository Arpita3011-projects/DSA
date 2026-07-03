class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character>hs=new HashSet<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!hs.contains(ch)){
                hs.add(ch);
                ans=Math.max(ans,right-left+1);
                right++;
            }else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
        

        
    }
}