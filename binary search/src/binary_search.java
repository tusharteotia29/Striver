public class binary_search {

    // recursive

    // public static int f(int[] arr,int low, int high,int target){
    //     if (low>high) {
    //         return -1;
            
    //     } 
    //     int mid=(low+high)/2;
    //     if (arr[mid]==target) {
    //         return mid;
            
    //     } else if(target>arr[mid]){
    //         return f(arr, mid+1, high, target);
            
    //     }

    //     return f(arr, low, mid-1, target);
    // }
    // public static int search(int []nums, int target) {
    //     // Write your code here.
    //     int n=nums.length;
    //         return f(nums, 0, n-1, target);

    // }

    // iterative

    public int search(int[] nums, int target) {

        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;

            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {
        
    }
}