class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0;i<n;i++){
            if(grid[i][0] == 0){
                toggleRow(grid,i);
            }
        }
        for(int j = 1;j<m;j++){
            int countOne = 0;
            for(int i = 0;i<n;i++){
                if(grid[i][j] == 1){
                    countOne++;
                }
            }
            if(n-countOne > countOne){
                toggleCol(grid,j);
            }
        }

        int ans = 0;
        for(int i = 0;i<n;i++){
            int curr = 0;
            for(int j = m-1;j>=0;j--){
                curr = curr + (grid[i][j]<<(m-1-j));
            }
            ans += curr;
        }
        return ans;
    }
    private void toggleRow(int grid[][],int i){
        for(int j = 0;j<grid[0].length;j++){
            grid[i][j] = 1 - grid[i][j];
        }
    }
    private void toggleCol(int grid[][],int j){
        for(int i = 0;i<grid.length;i++){
            grid[i][j] = 1 - grid[i][j];
        }
    }
}
