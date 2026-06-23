class Solution {
    public static int maxProfit(int[] SellPrices) {
        int buyPrice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<SellPrices.length;i++){
            if(buyPrice<SellPrices[i]){
                int profit=SellPrices[i]-buyPrice;
                max=Math.max(max,profit);

            }else {
                buyPrice=SellPrices[i];
            }
           
        }
         return max;
        
    }

}