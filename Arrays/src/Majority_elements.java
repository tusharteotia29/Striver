

import java.util.HashMap;
import java.util.Map;
public class Majority_elements {

    // Better approach
    // public int majorityElement(int[] nums) {

    //     int n=nums.length;

    //     HashMap<Integer,Integer> mpp=new HashMap<>();

    //     for (int i = 0; i < n; i++) {
    //         int value=mpp.getOrDefault(nums[i],0);
    //         mpp.put(nums[i], value+1);           
    //     }


    //     for (Map.Entry<Integer,Integer> it:mpp.entrySet()) {

    //         if (it.getValue()>(n/2)) {
    //             return it.getKey();
                
    //         }
            
    //     }

    //     return -1;
    // }




    // OPtimal approach

    //     Moore voting algo
    public int majorityElement(int[] nums) {
        int cnt=0;
        int el=0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt==0) {
                cnt=1;
                el=nums[i];
            } else if(nums[i] == el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt1=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
            if (cnt1> (nums.length)/2) {
                return el;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        
    }
    
}
