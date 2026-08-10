class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=bloomDay[0];
        int high=bloomDay[0];
        for(int flower:bloomDay){
            if(flower<low){
                low=flower;
            }
            if(flower>high){
                high=flower;
            }
                
            }
            while(low<high){
                int mid=low+(high-low)/2;
                if(canMakeBouquets(bloomDay,mid,m,k)){
                    high=mid;

                }else{
                    low=mid+1;
                }
            }
            return low;
        }
        private boolean  canMakeBouquets(int[] bloomDay,int day, int m, int k){
            int bouquets=0;
            int consecutive=0;
            for(int flower:bloomDay){
                if(flower<=day){
                    consecutive++;
                    if(consecutive==k){
                        bouquets++;
                        consecutive=0;
                    }

                }else{
                    consecutive=0;
                }
            }
            return bouquets>=m;
        }
    }
