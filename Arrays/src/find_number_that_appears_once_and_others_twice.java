import java.util.HashMap;
import java.util.Map;

public class find_number_that_appears_once_and_others_twice {


    // Brute Approach

    // public int singleNumber(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         int num=nums[i];
    //         int cnt=0;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[j]==num) {
    //                 cnt++;   
    //             }       
    //         }
    //         if (cnt==1) {
    //             return num;
    //         }
    //     }
    //     return -1;
    // }

    
    // Better Approach 2
        // Hashing

    //  public int singleNumber(int[] nums) {

    //     int maxi=nums[0];
    //     for(int i=0;i<nums.length;i++){
    //         maxi=Math.max(maxi,nums[i]);
    //     }
    //     int hash[]=new int[maxi+1];
    //     for(int j=0;j<nums.length;j++){
    //         hash[nums[j]]++;
    //     }
    //     for(int k=0;k<nums.length;k++){
    //         if(hash[nums[k]]==1) {
    //         return nums[k];
    //         }
    //     }
    //     return -1;

    //  }


   // Better Approach 2
        // Mapping

    //  public int singleNumber(int[] nums) {
    //     int n=nums.length;
    //     HashMap<Integer,Integer> map=new HashMap<>();

    //     for(int i=0;i<n;i++){
    //         int value=map.getOrDefault(nums[i], 0);
    //         map.put(nums[i], value+1);
    //     }

    //     for(Map.Entry<Integer,Integer> it:map.entrySet()){
    //         if (it.getValue()==1) {
    //             return it.getKey();  
    //         }
    //     }
    //     return -1;
    //  }


    // Optimal Approach

    // xor

    public int singleNumber(int[] nums) {
        int xor=0;
        for (int i = 0; i < nums.length; i++) {
            xor=xor^nums[i];
            
        }
        return xor;
    }



    public static void main(String[] args) {
        
    }
    
}
