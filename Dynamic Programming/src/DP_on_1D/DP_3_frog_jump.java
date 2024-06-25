package DP_on_1D;
public class DP_3_frog_jump {
    // public int f(int arr[],int ind,int dp[]){
    //     if(ind==0){
    //         return 0;
    //     }
    //     if(dp[ind] != -1) return dp[ind];
    //     int left=f(arr,ind-1,dp)+Math.abs(arr[ind]-arr[ind-1]);
    //     int right=Integer.MAX_VALUE;
    //     if(ind>1){
    //         right=f(arr,ind-2,dp)+Math.abs(arr[ind]-arr[ind-2]);
    //     }
    //      dp[ind]=Math.min(left,right);
    //      return dp[ind]; 
    // }


    // public int minimumEnergy(int arr[],int N){
    //     //code here
    //     int dp[]=new int[N];
    //     Arrays.fill(dp,-1);
    //     // return f(arr,N-1,dp);
    //     dp[0]=0;
    //     for(int i=1;i<N;i++){
    //         int ss=Integer.MAX_VALUE;
    //         int fs=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
    //         if(i>1){
    //              ss=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
    //         }
    //         dp[i]=Math.min(fs,ss);
    //     }
    //     return dp[N-1];
    // }
    
    
    public int minimumEnergy(int arr[],int N){
        //code here
       int prev=0;
       int prev2=0;
        // return f(arr,N-1,dp);
      
        for(int i=1;i<N;i++){
            int ss=Integer.MAX_VALUE;
            int fs=prev+Math.abs(arr[i]-arr[i-1]);
            if(i>1){
                 ss=prev2+Math.abs(arr[i]-arr[i-2]);
            }
            int curi=Math.min(fs,ss);
            prev2=prev;
            prev=curi;
        }
        return prev;
    }
}
