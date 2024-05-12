class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int result[][] = new int[n-2][n-2];
        for(int i = 0;i<n-2;i++){
            for(int j = 0;j<n-2;j++){
                result[i][j] = findMax(grid,i,j);
            }
        }
        return result;
    }
    private int findMax(int grid[][],int i,int j){
        int row = i;
        int col = j;
        int max = grid[row][col];
        for(i = row;i<row+3;i++){
            for(j = col;j<col+3;j++){
                if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
        }
        return max;
    }
}