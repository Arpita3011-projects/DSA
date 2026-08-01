class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        for(int pile:piles){
         if(pile>high){
            high=pile;

         }
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalHours=0;
            for(int pile:piles){
                int hours=pile/mid;
                if(pile%mid!=0){
                    hours++;

                }
                totalHours+=hours;
            }
            if(totalHours<=h){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}