class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1=s.length();
        int n2=p.length();
        List<Integer> ans=new ArrayList<>();
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        if(n1<n2) return ans;

        for(int i=0;i<n2;i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
          ans.add(0);
        }
        for(int i=n2;i<n1;i++){
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-n2)-'a']--;
            if(Arrays.equals(freq1,freq2)){
            ans.add(i-n2+1);
        }
        }
        
        return ans;
    }
}