class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int leftPointer=0;
        int rightPointer=height.length-1;
        while(leftPointer<rightPointer){
            int ht=Math.min(height[leftPointer],height[rightPointer]);
            int width=rightPointer-leftPointer;
            int currentWater=ht*width;
            maxWater=Math.max(currentWater,maxWater);
            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }

        return maxWater;
    }
}