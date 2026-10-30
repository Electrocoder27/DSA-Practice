class Solution {
    private boolean dfs(int[][] grid,int i,int j){
        int n = grid.length ;
        int m = grid[0].length ;

        if(i<0 || i>=n|| j<0 || j>=m){
            return false ;
        } 

        if(grid[i][j] ==1){
            return true ;
        }
        grid[i][j] = 1 ;
        boolean left_cl = dfs(grid,i,j-1) ;
        boolean right_cl = dfs(grid,i,j+1) ;
        boolean down_cl = dfs(grid,i-1,j) ;
        boolean up_cl = dfs(grid,i+1,j) ;


        return (left_cl && right_cl && down_cl && up_cl) ;
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;

        int cnt = 0;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 0){
                    if(dfs(grid,i,j)){
                        cnt++;
                    }
                }
            }
        }
        return cnt ;
    }
}