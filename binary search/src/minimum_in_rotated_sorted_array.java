public class minimum_in_rotated_sorted_array {

    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;

            // MORE OPTIMIZATION

            // search space is already sorted
            // then always nums[low] will be smaller
            // in that search space
            
            // if(nums[low]<=nums[high]){
            //     ans=Math.min(ans,nums[low]);
            //     break;
            // }

            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            else{
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
    
}
