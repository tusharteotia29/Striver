package DP_on_GRIDS_2D_3D;

import java.util.Arrays;

public class DP_13_chocolate_pickup {

     public int f(int i,int j1,int j2,int n,int m,int grid[][] ,int dp[][][]){
        if(j1<0 || j2<0 || j1>=m || j2>=m){
            return (int) (Math.pow(-10,9));
        }
        if(i==n-1){
            if(j1==j2) return grid[i][j2];
            else return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        
        // explore all paths of alice and bob
        
        int maxi= Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=+1;dj1++){
            for(int dj2=-1;dj2<=+1;dj2++){
                int value=0;
                if(j1==j2) value=grid[i][j1];
                else value=grid[i][j1]+grid[i][j2];
                value+=f(i+1, j1+dj1, j2+dj2, n, m, grid,dp);
                maxi=Math.max(maxi,value);
                
            }
        }
        
        return dp[i][j1][j2]= maxi;
        
    }
    public int solve(int n, int m, int grid[][]){
        // Code here
        int dp[][][]=new int[n][m][m];
         for (int row1[][] : dp) {
      for (int row2[] : row1) {
        Arrays.fill(row2, -1);
      }
    }
        return f(0,0,m-1,n,m,grid,dp);
    }

    public static void main(String[] args) {
        
    }
    
}
