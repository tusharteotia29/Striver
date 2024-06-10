import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class rotate_array_left_by_d_place {


    // using for loop approach

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> nums, int k) {
        // Write your code here.

        int n=nums.size();
        k=k%n;

        ArrayList<Integer> temp=new ArrayList<>(k);

        // inserting in temp
        for(int i=0;i<k;i++){
            temp.add(nums.get(i));
        } 

        // Shifting
        for(int i=k; i<n;i++){
            nums.set(i-k,nums.get(i));
        }

        // pushback in temp
        for(int i=n-k;i<n;i++){
            nums.set(i,temp.get(i-(n-k)));

        }

        return nums;

    }

    

    // optimal appproach


    public static void reverse(ArrayList<Integer> nums,int start,int end){
        while (start<end) {
            int temp=nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
            
        }
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> nums, int k){

        int n=nums.size();
        k=k%n;

        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);


        return nums;
    }


    



    public static void main(String[] args) {
        
    }
    
}
