import java.util.HashMap;

public class Two_sum {


    // Better Approach 
        // Hashing

    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int num=nums[i];
            int moreneeded=target-num;
            if (mpp.containsKey(moreneeded)) {
                ans[0]=mpp.get(moreneeded);
                ans[1]=i;
                return ans;
                
            }
            mpp.put(nums[i], i);
            
        }

        return ans;
        
    }

    // OPtimal Approach
        // Two pointer approach

        

    public static void main(String[] args) {
        
    }

    
    
}
