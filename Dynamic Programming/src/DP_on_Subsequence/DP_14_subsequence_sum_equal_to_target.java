package DP_on_Subsequence;

public class DP_14_subsequence_sum_equal_to_target {


    // static Boolean Subsetsum(int ind ,int target,int dp[][],int arr[]){
        //         if(target==0) return true;
        //         if(ind==0) return (arr[0]==target);
                
        //         if(dp[ind][target] != -1){
        //             return dp[ind][target] == 0 ? false : true;
        //         }
                
        //         boolean notTaken=Subsetsum(ind-1,target,dp,arr);
        //         boolean taken=false;
                
        //         if(arr[ind]<=target){
        //              taken=Subsetsum(ind-1,target-arr[ind],dp,arr);
        //         }
                
        //          dp[ind][target]= notTaken || taken ? 1 :0;
                
        //         return notTaken || taken;
        //     }
        
        
        //     static Boolean isSubsetSum(int N, int arr[], int sum){
        //         int dp[][]=new int [N+1][sum+1];
                
        //         for(int row[]:dp){
        //             Arrays.fill(row,-1);
        //         }
        //         // code heretrue
        //         return Subsetsum(N-1,sum,dp,arr);
        //     }
        // }
        
        
         static Boolean isSubsetSum(int N, int arr[], int sum){
                boolean dp[][]=new boolean [N][sum+1];
                
                for(int i=0;i<N;i++) {
                        dp[i][0]=true;
                }
                if (arr[0] <= sum) dp[0][arr[0]]=true;
                
                for(int ind=1;ind<N;ind++){
                    for(int target=1;target<=sum;target++){
                         boolean notTaken=dp[ind-1][target];
                         
                         boolean taken=false;
                
                        if(arr[ind]<=target) taken=dp[ind-1][target-arr[ind]];
                        
                        dp[ind][target]= notTaken || taken;
                        
                    }
                        
                }
                return dp[N-1][sum];
            }

            public static void main(String[] args) {
                
            }
    
}
