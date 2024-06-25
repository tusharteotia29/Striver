package DP_on_1D;
public class DP_5_house_robber {


    // public int f(int ind,int a[]){
    //     if(ind==0) return a[ind];

    //     if(ind<0) return 0;

    //     int pick=a[ind]+f(ind-2,a);
    //     int notpick=0+f(ind-1,a);

    //     return Math.max(pick,notpick);
    // }
    // public int rob(int[] nums) {
    //     int n=nums.length;
    //     return f(n-1,nums);
        
    // }

    // Memoization


    // public int f(int ind,int a[],int dp[]){
    //     if(ind==0) return a[ind];

    //     if(ind<0) return 0;

    //     if(dp[ind] != -1) return dp[ind];

    //     int pick=a[ind]+f(ind-2,a,dp);
    //     int notpick=0+f(ind-1,a,dp);

    //     return dp[ind]=Math.max(pick,notpick);
    // }
    // public int rob(int[] nums) {
    //     int n=nums.length;
    //     int dp[]=new int[n];
    //     Arrays.fill(dp,-1);
    //     return f(n-1,nums,dp);
        
    // }

    // tabulation


    // public int f(int n,int a[],int dp[]){
    //     dp[0]=a[0];
    //     int neg=0;

    //     for(int i=1;i<n;i++){
    //         int take=a[i];
    //         if(i>1){
    //             take+=dp[i-2];
    //         }
    //         int nontake=0+dp[i-1];

    //         dp[i]=Math.max(take,nontake);
    //     }
        

    //     return dp[n-1];
    // }
    // public int rob(int[] nums) {
    //     int n=nums.length;
    //     int dp[]=new int[n];
    //     Arrays.fill(dp,-1);
    //     return f(n,nums,dp);     
    // }

    // Space optimization

    public int rob(int[] nums) {
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;

        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int nontake=0+prev;

            int curi=Math.max(take,nontake);
            prev2=prev;
            prev=curi;
        }

        return prev;
        
        
    }

    public static void main(String[] args) {
        
    }
    
}
