class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int ans=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            int index=ch-'A';
            freq[index]++;

            maxfreq=Math.max(maxfreq,freq[index]);

            int windowsize=right-left+1;
            int changesneeded=windowsize-maxfreq;
            if(changesneeded>k){
                char leftchar=s.charAt(left);
                int ind=leftchar-'A';
                freq[ind]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;

        
    }
}