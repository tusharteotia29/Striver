package DP_on_1D;

public class DP_6_house_robber_2 {

    public int maximumNonAdjacentSum(int[] nums) {
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

     public int rob(int[] nums){
       int n = nums.length;
        if (n == 1) return nums[0];
        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                temp1[i - 1] = nums[i];
            }
            if (i != n - 1) {
                temp2[i] = nums[i];
            }
        }
        int ans1 = maximumNonAdjacentSum(temp1);
        int ans2 = maximumNonAdjacentSum(temp2);
            return Math.max(ans1,ans2);
     }

     public static void main(String[] args) {
        
     }
    
}
