class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        int startCol=0;
        int startRow=0;
        int endCol=matrix[0].length-1;
        int endRow=matrix.length-1;
        while(startCol<=endCol && startRow<=endRow ){
            for(int j=startCol;j<=endCol;j++){
                ans.add (matrix[startRow][j]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                ans.add(matrix[i][endCol]) ;
            }

             if(startRow<endRow){
            for(int j=endCol-1;j>=startCol;j--){
                     ans.add( matrix[endRow][j]);

                }
               
            }
            if(startCol<endCol){
            for(int i=endRow-1;i>=startRow+1;i--){
                ans.add(matrix[i][startCol]);
              
                }
                
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        return ans;
        
    }
}