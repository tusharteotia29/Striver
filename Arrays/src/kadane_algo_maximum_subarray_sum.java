public class kadane_algo_maximum_subarray_sum {

    // optimal approach
        // Kadane algo

    public int maxSubArray(int[] nums) {

        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return maxi;
        
    }

    public static void main(String[] args) {
        
    }
    
}
