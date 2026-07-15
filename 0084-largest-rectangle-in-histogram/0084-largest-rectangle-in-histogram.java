class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stack=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                         int height=heights[stack.pop()];
                         int left=stack.isEmpty()?-1:stack.peek();
                         int right=i;
                         int width=right-left-1;
                         int area=height*width;
                         maxArea=Math.max(maxArea,area);

            }
            stack.push(i);

        }
        while(!stack.isEmpty()){
            int height=heights[stack.pop()];
                         int left=stack.isEmpty()?-1:stack.peek();
                         int right=n;
                         int width=right-left-1;
                         int area=height*width;
                         maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}