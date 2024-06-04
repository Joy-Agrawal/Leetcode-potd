class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = '-';
                }
            }
        }
        //left
        for(int i = 0;i<row;i++){
            if(board[i][0] == '-'){
                dfs(board,i,0,'-','O');
            }
        }
        //right
        for(int i = 0;i<row;i++){
            if(board[i][col-1] == '-'){
                dfs(board,i,col-1,'-','O');
            }
        }
        //top
        for(int i = 0;i<col;i++){
            if(board[0][i] == '-'){
                dfs(board,0,i,'-','O');
            }
        }
        //bottom
        for(int i = 0;i<col;i++){
            if(board[row-1][i] == '-'){
                dfs(board,row-1,i,'-','O');
            }
        }

        // now rest of the cells will be replaced by x
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(board[i][j] == '-'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char grid[][],int x,int y,char prev,char next){
        if(x<0 || x>=grid.length || y<0 ||y>=grid[0].length){
            return;
        }
        if(grid[x][y] != prev){
            return;
        }
        grid[x][y] = 'O';
        dfs(grid,x+1,y,prev,next);
        dfs(grid,x-1,y,prev,next);
        dfs(grid,x,y+1,prev,next);
        dfs(grid,x,y-1,prev,next);
    }
}