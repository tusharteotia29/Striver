package DP_on_GRIDS_2D_3D;

class DP_10_Minimum_Path_sum_in_grid {
    
 // public int f(int grid[][],int i,int j){
    //     if(i==0 && j==0) return grid[0][0];
    //     else if(i<0 || j<0) return (int) Math.pow(10, 9);
        

    //     int up=grid[i][j] + f(grid,i-1,j);
    //     int left=grid[i][j]+f(grid,i,j-1);

    //     return Math.min(up,left);
    // }
    // public int minPathSum(int[][] grid) {

    //     int i=grid.length;
    //     int j=grid[0].length;
       

    //     return f(grid,i-1,j-1);
        
    // }



    // public int f(int grid[][],int i,int j,int dp[][]){
    //     if(i==0 && j==0) return grid[0][0];
    //     else if(i<0 || j<0) return (int) Math.pow(10, 9);
    //     else if(dp[i][j] != -1) return dp[i][j];

    //     int up=grid[i][j] + f(grid,i-1,j,dp);
    //     int left=grid[i][j]+ f(grid,i,j-1,dp);

    //     return dp[i][j]=Math.min(up,left);
    // }


    //  public int minPathSum(int[][] grid) {

    //     int i=grid.length;
    //     int j=grid[0].length;
    //     int dp[][]=new int[i][j] ;
    //     for(int row[]:dp){
    //         Arrays.fill(row,-1);
    //     }

    //     return f(grid,i-1,j-1,dp);
        
    // }



    


    //  public int minPathSum(int[][] grid) {

    //     int m=grid.length;
    //     int n=grid[0].length;
    //     int dp[][]=new int[m][n] ;
    //     // for(int row[]:dp){
    //     //     Arrays.fill(row,-1);
    //     // }

    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==0 && j==0 )  dp[i][j]=grid[0][0];
    //             else{
    //                 int up=grid[i][j];
    //                 if(i>0)  up+= dp[i-1][j];
    //                 else{
    //                     up += (int) Math.pow(10, 9);
    //                 }

    //                 int left=grid[i][j];
    //                 if(j>0)  left+= dp[i][j-1];
    //                 else{
    //                     left += (int) Math.pow(10, 9);
    //                 }
    //                 dp[i][j]=Math.min(up,left);
    //             }
    //         }
    //     }

    //     return dp[m-1][n-1];
        
    // }


    public int minPathSum(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int prev[]=new int[m];
        // for(int row[]:dp){
        //     Arrays.fill(row,-1);
        // }

        for(int i=0;i<m;i++){
            int curr[] = new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0 )  curr[j]=grid[0][0];
                else{
                    int up=grid[i][j];
                    // requires previos row j column
                    if(i>0)  up+= prev[j];
                    else{
                        up += (int) Math.pow(10, 9);
                    }

                    int left=grid[i][j];
                    // requires current row j-1 column
                    if(j>0)  left+= curr[j-1];
                    else{
                        left += (int) Math.pow(10, 9);
                    }
                    curr[j]=Math.min(up,left);
            
                
                }
                }
            
            prev=curr;
        }

        return prev[n-1];
        
    }

    public static void main(String[] args) {
        
    }
    
}