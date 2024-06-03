package A2Zsheet;

import java.util.ArrayList;
import java.util.List;

public class permutations_2_approach {

    public void recurpermute(int ind, int nums[],List<List<Integer>> ans){
      if (ind==nums.length) {
        List<Integer> ds=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
          ds.add(nums[i]);
          
        }        
        ans.add(new ArrayList<>(ds));
        return;
      }
      for (int i = ind; i < nums.length; i++) {
        swap(i,ind,nums);
        recurpermute(ind+1, nums, ans);
        swap(i,ind,nums);
        
      }

    }

    private void swap(int i, int j, int[] nums){
      int t =nums[i];
      nums[i]=nums[j];
      nums[j]=t;
    }

      public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recurpermute(0,nums,ans);
        return ans;
      }



      public static void main(String[] args) {
        
    }
    
}
