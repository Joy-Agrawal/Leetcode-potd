class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int count = 0;
        for(int i = 0;i<nr;i++){
            for(int j = 0;j<nc;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j,nr,nc);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int r,int c,int nr,int nc){

        if(r<0 || c<0 || r>=nr || c>= nc || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid,r+1,c,nr,nc);
        dfs(grid,r,c+1,nr,nc);
        dfs(grid,r-1,c,nr,nc);
        dfs(grid,r,c-1,nr,nc);
    }
}