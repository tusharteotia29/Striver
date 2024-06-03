package A2Zsheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2 {

    public void findsubsets(int ind,int nums[],List<Integer> ds,List<List<Integer>> anslist){

        anslist.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i!=ind && nums[i]==nums[i-1]) {
                continue;
                
            }
            ds.add(nums[i]);
            findsubsets(i+1, nums, ds, anslist);
            ds.remove(ds.size()-1);
            
        }

    }

     public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ansList=new ArrayList<>();
        Arrays.sort(nums);
        findsubsets(0, nums, new ArrayList<>(), ansList);

        return ansList;

        
    }
    

    public static void main(String[] args) {


        
    }
}