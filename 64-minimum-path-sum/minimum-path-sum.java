class Solution {
    int[][] grid;
    int[][] dp;
    public int func(int i,int j){
        if (i == 0 && j == 0) return  grid[i][j];

        if(i<0 || j < 0) return Integer.MAX_VALUE;

        if(dp[i][j]!=-1) return dp[i][j];

        int up = func(i-1,j);
        int left = func(i,j-1);

        return dp[i][j] =  grid[i][j] + Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        this.grid = grid;
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        this.dp = dp;
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return func(m-1,n-1);
    }
}