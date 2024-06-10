public class rotate_array_by_1_place {


    static int[] rotateArray(int[] nums, int n) {
        // Write your code here.
        int temp=nums[0];

        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }

        nums[n-1]=temp;
        return nums;

    }

    public static void main(String[] args) {
        
    }
    
}
