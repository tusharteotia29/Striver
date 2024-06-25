package DP_on_GRIDS_2D_3D;

import java.util.List;

public class DP_11_Minimum_Path_sum_in_triangular_grid {

    // public int f(int i,int j,int n,List<List<Integer>> triangle){
    //     if(i==n-1) return triangle.get(n-1).get(j);

    //     int down=triangle.get(i).get(j)+f(i+1,j,n,triangle);
    //     int diagonal=triangle.get(i).get(j)+f(i+1,j+1,n,triangle);

    //     return Math.min(down,diagonal);
    // }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n=triangle.size();
        
    //     return f(0,0,n,triangle);
        
        
    // }


    // public int f(int i,int j,int n,List<List<Integer>> triangle,int dp[][]){
    //     if(i==n-1) return triangle.get(n-1).get(j);

    //     if(dp[i][j] != -1) return dp[i][j];
    //     int down=triangle.get(i).get(j)+f(i+1,j,n,triangle,dp);
    //     int diagonal=triangle.get(i).get(j)+f(i+1,j+1,n,triangle,dp);

    //     return dp[i][j]=Math.min(down,diagonal);
    // }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n=triangle.size();
    //      if (n == 0) return 0; 
    //     int dp[][]=new int[n][n];
    //     for(int row[]:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return f(0,0,n,triangle,dp);
        
        
    // }


    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n=triangle.size();
    //      if (n == 0) return 0; 
    //     int dp[][]=new int[n][n];
        
       
    //     for(int i=0;i<n;i++) dp[n-1][i]=triangle.get(n-1).get(i);


    //     for(int i=n-2;i>=0;i--){
    //         for(int j=i;j>=0;j--){
    //             int d=triangle.get(i).get(j) + dp[i+1][j];
    //             int dg=triangle.get(i).get(j) +dp[i+1][j+1];
    //             dp[i][j]=Math.min(d,dg);
    //         }


    //     }
    //     return dp[0][0];
        
        
    // }


     public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
         if (n == 0) return 0; 
        
        int front[]=new int [n];
        int cur[]=new int[n];
        
       
        for(int i=0;i<n;i++) front[i]=triangle.get(n-1).get(i);


        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=triangle.get(i).get(j) + front[j];
                int dg=triangle.get(i).get(j) +front[j+1];
                cur[j]=Math.min(d,dg);
            }
            front=cur.clone();


        }
        return front[0];
        
        
    }

    public static void main(String[] args) {
        
    }

    
    
}
