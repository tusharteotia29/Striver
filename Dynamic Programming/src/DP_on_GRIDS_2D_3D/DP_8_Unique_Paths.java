package DP_on_GRIDS_2D_3D;
public class DP_8_Unique_Paths {


    // public int uniquePaths(int m, int n) {
    //     if(m==0 && n==0) return 1;
    //     if(m<0 || m<0) return 0;

    //     int up=uniquePaths(m-1,n);
    //     int left=uniquePaths(m,n-1);

    //     return up+left;
    // }

//     public int f(int m,int n,int dp[][]){
       
//         if(m==0 && n==0) return 1;
//         if(m<0 || n<0) return 0;
//         if(dp[m][n] != -1) return dp[m][n];

//         int up=f(m-1,n,dp);
//         int left=f(m,n-1,dp);

//         return dp[m][n]=up+left;
//     }

    

// public int uniquePaths(int m, int n) {
//     int dp[][]=new int[m][n];
//       for(int row[]:dp){
//         Arrays.fill(row,-1);
//     }

//     return f(m-1,n-1,dp);

// }
   


    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m][n];

    //     dp[0][0]=1;

    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==0 && j==0) {
    //                 dp[0][0]=1;
    //                 continue;
    //             }
    //             int up=0;
    //             int left=0;
    //             if(i>0){
    //                 up=dp[i-1][j];
    //             }
    //             if(j>0){
    //                 left=dp[i][j-1];
    //             }

    //             dp[i][j]=up+left;
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }


    public int uniquePaths(int m, int n){
        int prev[]=new int[n];

        for(int i=0;i<m;i++){
            int temp[]=new int[n] ;
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j]=1;
                    continue;
                }
                int up=0;
                int left=0;

                if(i>0) up=prev[j];
                if(j>0) left=temp[j-1];

                temp[j]=up+left;

            }
            prev=temp;
        }
        return prev[n-1];
     }

    public static void main(String[] args) {
        
    }
    
}
