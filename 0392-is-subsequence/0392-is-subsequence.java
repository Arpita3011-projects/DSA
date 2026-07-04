class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            char ch=s.charAt(i);
            char Char=t.charAt(j);
            if(ch==Char){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
        
    }
}