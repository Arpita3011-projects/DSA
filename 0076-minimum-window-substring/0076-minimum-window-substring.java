class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }

        HashMap<Character, Integer>target=new HashMap<>();
        HashMap<Character, Integer>window=new HashMap<>();

        for(char ch:t.toCharArray()){
            target.put(ch,target.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=0;
        int formed=0;
        int required=target.size();

         int minLength=Integer.MAX_VALUE;
         int start=0;
         while(right<s.length()){
            char ch=s.charAt(right);
            window.put(ch, window.getOrDefault(ch,0)+1);

            if(target.containsKey(ch)&&window.get(ch).intValue()==target.get(ch).intValue()){
                formed++;
            }
            while(left<=right && formed==required){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    start=left;
                }

                char leftchar=s.charAt(left);
                window.put(leftchar,window.get(leftchar)-1);
                if(target.containsKey(leftchar)&&window.get(leftchar)<target.get(leftchar)){
                    formed--;

                }
                left++;
            }
            right++;
         }
         return minLength==Integer.MAX_VALUE ? "": s.substring(start,start+minLength);
            }

         }
        
    