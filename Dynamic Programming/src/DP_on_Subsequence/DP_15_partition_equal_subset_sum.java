package DP_on_Subsequence;

public class DP_15_partition_equal_subset_sum {

    public boolean canPartition(int[] arr) {
        int totalsum=0;
        int N=arr.length;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }

        if (totalsum %2 ==1)return false;
        else{
            int k=totalsum/2;


            boolean dp[][]=new boolean [N][k+1];
        
            for(int i=0;i<N;i++) {
                dp[i][0]=true;
            }
            if (arr[0] <= k) dp[0][arr[0]]=true;
            
            for(int ind=1;ind<N;ind++){
                for(int target=1;target<=k;target++){
                        boolean notTaken=dp[ind-1][target];
                    
                    boolean taken=false;
        
                    if(arr[ind]<=target) taken=dp[ind-1][target-arr[ind]];
                
                    dp[ind][target]= notTaken || taken;
                
                 }
                
            }
            return dp[N-1][k];
        
        }
        

        
    }
    public static void main(String[] args) {
        
    }
    
}
