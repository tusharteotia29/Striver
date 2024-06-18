public class Sort_array_of_0s_1s_2s {

    // Better Approach

    // public void sortColors(int[] nums) {
    //     int cnt0=0;
    //     int cnt1=0;
    //     int cnt2=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i]==0) {
    //             cnt0++;
    //         } else if(nums[i]==1) {
    //             cnt1++;
    //         }else{
    //             cnt2++;
    //         }
    //     }
    //     for (int i = 0; i < cnt0; i++) {
    //         nums[i]=0;   
    //     }
    //     for (int i = cnt0; i < cnt0+cnt1; i++) {
    //         nums[i]=1;            
    //     }
    //     for (int i = cnt0+cnt1; i < nums.length; i++) {
    //         nums[i]=2;
    //     }
    // }


    // OPtimal approach

    // DNF(DUtch national flah algo)

    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;

                low++;
                mid++;

            }
            else if(nums[mid]==1){
                mid++;

            }

            else{
                int temp2=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp2;

                high--;

            }
        }
    }

    public static void main(String[] args) {
        
    }
    
}
