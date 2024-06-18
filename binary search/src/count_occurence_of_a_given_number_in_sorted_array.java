public class count_occurence_of_a_given_number_in_sorted_array {


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
    
     public int[] searchRange(int[] nums, int n,int target) {
        
        
        int f= firstoccurence(nums,n,target);
        if(f==-1) return new int[] {-1,-1};
        int l= lastoccurence(nums,n,target);

        return new int[] {f,l};
    }
    
    
    
    int count(int[] arr, int n, int x) {
    // code here
    
    int[] ans=searchRange(arr,n,x);
    if(ans[0]==-1) return 0;
    return (ans[1]-ans[0]+1);
    
}


    public static void main(String[] args) {
        
    }
    
}
