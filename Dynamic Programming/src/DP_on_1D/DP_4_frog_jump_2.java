package DP_on_1D;
import java.util.Arrays;

public class DP_4_frog_jump_2 {

    // recursion


    // public int f(int arr[],int ind,int K){
    //     if(ind==0){
    //         return 0;
    //     }
    //     int mmsteps=Integer.MAX_VALUE;
    //     if(ind== -1) return 0;

    //     for (int i = 1; i <= K; i++) {
           
        
    //     if(ind-j>=0){
    //         int jmp=f(arr,ind-i,K)+Math.abs(arr[ind]-arr[ind-i]);
    //         mmsteps=Math.min(mmsteps, jmp);
            
    //     }
        
    //     }
    //      return mmsteps;
    // }

    // public int minimizeCost(int arr[],int N,int K){
    //     //code here
    //     return f(arr, N,K);
    // }




    // Memoization

    // public int f(int arr[],int ind,int dp[],int K){
    //              if(ind==0){
    //                 return 0;
    //             }
    //             int mmsteps=Integer.MAX_VALUE;
    //             if(dp[ind]!= -1) return dp[ind];
    //             for (int i = 1; i <= K; i++) {
    //             if(ind-i>=0){
    //                 int jmp=f(arr,ind-i,dp,K)+Math.abs(arr[ind]-arr[ind-i]);
    //                 mmsteps=Math.min(mmsteps, jmp);
    //             }
    //         }
    //              return dp[ind]=mmsteps;
    //     }
    
    //     public int minimizeCost(int arr[],int N,int K){
    //              //code here
    //              int dp[]=new int[N];
    //              Arrays.fill(dp, -1);
    //              return f(arr, N, dp,K);
    //     }



        public int f(int arr[],int N,int dp[],int K){
            dp[0]=0;
           for (int i = 1; i <= N; i++) {
            int mmsteps=Integer.MAX_VALUE;
            for (int j=1;j<=K;j++) {
                if(i-j>=0){
                    int jmp=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    mmsteps=Math.min(mmsteps, jmp);
            }
           }
           dp[i]=mmsteps;
       }
            return dp[N-1];
   }

   public int minimizeCost(int arr[],int N,int K){
            //code here
            int dp[]=new int[N];
            Arrays.fill(dp, -1);
            return f(arr, N, dp,K);
   }

    public static void main(String[] args) {
        
    }
    
}
