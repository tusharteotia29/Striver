public class first_and_last_occurence_of_number_in_sorted_array {

    // using lower bound and upper bound

    // public int lowerbound(int arr[],int n,int target){
        //     int low=0;
        //     int high=n-1;
        //     int ans=n;
        //     while(low<=high){
        //         int mid=(low+high)/2;
        //         if(arr[mid]>=target){
        //             ans=mid;
        //             high=mid-1;
    
        //         }
        //         else{
        //             low=mid+1;
        //         }
        //     }
        //     return ans;
        // }
    
        // public int upperbound(int arr[],int n,int target){
        //     int low=0;
        //     int high=n-1;
        //     int ans=n;
        //     while(low<=high){
        //         int mid=(low+high)/2;
        //         if(arr[mid]>target){
        //             ans=mid;
        //             high=mid-1;
    
        //         }
        //         else{
        //             low=mid+1;
        //         }
        //     }
        //     return ans;
        // }
    
    
        //  public int[] searchRange(int[] nums, int target) {
            
        //     int n=nums.length;
        //     int lb=lowerbound(nums,n,target);
        //     if(lb==n || nums[lb] != target) {
        //         return new int[] {-1,-1};
        //     }
        //     return new int [] {lb,upperbound(nums,n,target)-1};
        // }


    
        // using binary search
    
        public int firstoccurence(int[] arr,int n,int target){
            int low=0;
            int high=n-1;
            int first=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    first=mid;
                    high=mid-1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
    
                }
                else{
                    high=mid-1;
                }
            }
            return first;
        }
    
    
        public int lastoccurence(int[] arr,int n,int target){
             int low=0;
            int high=n-1;
            int last=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    last=mid;
                    low=mid+1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
    
                }
                else{
                    high=mid-1;
                }
            }
    
            return last;
    
        }
    
        public int[] searchRange(int[] nums, int target) {
            
            int n=nums.length;
            int f= firstoccurence(nums,n,target);
            if(f==-1) return new int[] {-1,-1};
            int l= lastoccurence(nums,n,target);
    
            return new int[] {f,l};
        }

        public static void main(String[] args) {
            
        }
    
}
