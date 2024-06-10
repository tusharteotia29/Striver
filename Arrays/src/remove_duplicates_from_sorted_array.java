public class remove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {


        int i=0;
        for(int j=0; j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
        
    }

    public static void main(String[] args) {
        
    }
    
}
