package DP_on_GRIDS_2D_3D;

import java.util.Arrays;

public class DP_12_minimum_maximum_falling_path_sum {

     // public int solve(int matrix[][],int i,int j,int dp[][]){
    //     if(j<0 || j>=matrix[0].length) return (int)Math.pow(10, 9);
    //     if(i==0 ) return matrix[0][j];
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int u=matrix[i][j]+solve(matrix,i-1,j,dp);
    //     int ld=matrix[i][j] +solve(matrix,i-1,j-1,dp);
    //     int rd=matrix[i][j] +solve(matrix,i-1,j+1,dp);

    //     return dp[i][j]=Math.min(u,Math.min(ld,rd));
    // }
    // public int minFallingPathSum(int[][] matrix) {

    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     int dp[][]=new int [n][m];
    //     for (int row[] : dp)
    //         Arrays.fill(row, -1);
        
    //     int min=Integer.MAX_VALUE;
    //     for(int j=0;j<m;j++){
    //         min=Math.min(min,solve(matrix,n-1,j,dp));
    //     }

    //     return min;
    // }



    // public int minFallingPathSum(int[][] matrix) {
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     int dp[][]=new int [n][m];

    //     for(int j=0;j<m;j++){
    //         dp[0][j]=matrix[0][j];
    //     }

    //     for(int i=1;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             int up=matrix[i][j] + dp[i-1][j];
    //             int ld=matrix[i][j];
    //             if(j-1>=0)   ld+= dp[i-1][j-1];
    //             else ld+=(int)Math.pow(10, 9);
               
    //             int rd=matrix[i][j] ;
    //             if(j+1<m) rd+= dp[i-1][j+1];
    //             else rd+=(int)Math.pow(10, 9);
                
    //             dp[i][j]=Math.min(up,Math.min(ld,rd));
            
    //         }

    //     }

    //     int min=Integer.MAX_VALUE;
    //     for(int j=0;j<m;j++){
    //         min=Math.min(min,dp[n-1][j]);
    //     }
    //     return min;

    // }


public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int prev[]=new int[m];
        int curr[]=new int[m];

        Arrays.fill(prev,0);
        Arrays.fill(curr,0);
       
        for(int j=0;j<m;j++){
            prev[j]=matrix[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=matrix[i][j] + prev[j];
                int ld=matrix[i][j];
                if(j-1>=0)   ld+= prev[j-1];
                else ld+=(int)Math.pow(10, 9);
               
                int rd=matrix[i][j] ;
                if(j+1<m) rd+= prev[j+1];
                else rd+=(int)Math.pow(10, 9);
                
                curr[j]=Math.min(up,Math.min(ld,rd));
            
            }
            prev=curr.clone();

        }

        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            min=Math.min(min,prev[j]);
        }
        return min;

    }
    public static void main(String[] args) {
        
    }
    
}
