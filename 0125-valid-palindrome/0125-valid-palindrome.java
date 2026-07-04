class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
         String str=s.toLowerCase();
        while(left<right){
           
            char ch=str.charAt(left);

           if(!Character.isLetterOrDigit(ch)) {
            left++;
            continue;
           }
           char Char=str.charAt(right);
           if(!Character.isLetterOrDigit(Char)){
            right--;
            continue;
           }

           if(str.charAt(left)!=str.charAt(right)){
                return false;
           }
           
             left++;
            right--;
        }   
        return true;
    }
}