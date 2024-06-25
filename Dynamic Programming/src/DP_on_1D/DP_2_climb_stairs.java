package DP_on_1D;

import java.util.Arrays;

public class DP_2_climb_stairs {
    
     // public int countS(int dp[],int index) {

    //     if(index==1 || index==0){
    //         return 1;
    //     }
    //     if(dp[index] != -1) return dp[index];
        
    //     dp[index]=countS(dp,index-1)+countS(dp,index-2);

    //     return dp[index];
    // }

    //  public int climbStairs(int n){
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return countS(dp,n);
    //  }

    public int climbStairs(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        
    }
}
