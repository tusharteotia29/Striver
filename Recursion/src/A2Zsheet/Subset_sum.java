package A2Zsheet;

import java.util.ArrayList;
import java.util.Collections;

public class Subset_sum {

    void func(int ind,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> sumsubset){
        if (ind==n) {
            sumsubset.add(sum);
            return;
            
        }

        func(ind+1, sum+arr.get(ind), arr, n, sumsubset);

        func(ind+1, sum, arr, n, sumsubset);

    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {

        // code here
        ArrayList<Integer> sumsubset=new ArrayList<>();
        func(0,0,arr,n,sumsubset);
        Collections.sort(sumsubset);
        return sumsubset;
    }

    public static void main(String[] args) {
        
    }
    
}
