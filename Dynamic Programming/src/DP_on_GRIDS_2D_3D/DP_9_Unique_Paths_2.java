package DP_on_GRIDS_2D_3D;

import java.util.Arrays;

public class DP_9_Unique_Paths_2 {

    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //       if(obstacleGrid==null||obstacleGrid.length==0) return 0;
    //     int m = obstacleGrid.length;
    //     int n = obstacleGrid[0].length;
    //      if(m>=0 && n>=0 && obstacleGrid[m][n]== 1) return 0;
    //      if(m==0 && n==0) return 1;
    //     if(m<0 || m<0) return 0;

    //     int up=uniquePaths(m-1,n);
    //     int left=uniquePaths(m,n-1);

    //     return up+left;
        
    // }


        public int f(int[][] obstacleGrid,int dp[][],int m,int n) {
         
         if(m>=0 && n>=0 && obstacleGrid[m][n]== 1) return 0;
         if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n] != -1) return dp[m][n];

        int up=f(obstacleGrid,dp,m-1,n);
        int left=f(obstacleGrid,dp,m,n-1);

        return dp[m][n]=up+left;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid==null||obstacleGrid.length==0) return 0;
         int m = obstacleGrid.length;
         int n = obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        
        for(int row[]:dp){
        Arrays.fill(row,-1);
    }

    return f(obstacleGrid,dp,m-1,n-1);

    }

    public static void main(String[] args) {
        
    }
    
}
