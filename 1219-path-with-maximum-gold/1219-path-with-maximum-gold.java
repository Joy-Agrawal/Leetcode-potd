class Solution {
    int dir[][] = {{-1,0},
                    {1,0},
                    {0,-1},
                    {0,1}};
    private int DFS(int grid[][],int i,int j,int m,int n){
        //base condition 
        if(i >= m || i<0 || j>=n || j<0 || grid[i][j] == 0){
            return 0;
        }
        int original = grid[i][j]; //store the original value for reverting/backtracking 
        grid[i][j] = 0; //this indicates as marked as visited
        
        int maxGold = 0;
        for(int arr[] : dir){
            int new_i = i+arr[0];
            int new_j = j+arr[1];
            maxGold = Math.max(maxGold,DFS(grid,new_i,new_j,m,n));
        }
        grid[i][j] = original;
        return original + maxGold;
    }

    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxGold = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] != 0){
                    //i.e it has gold
                    maxGold = Math.max(maxGold,DFS(grid,i,j,m,n));
                }
            }
        }
        return maxGold;
    }
}