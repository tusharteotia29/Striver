import java.util.ArrayList;
import java.util.List;

public class print_any_1_subsequence_sum_k {

    public static boolean printS(int ind, List<Integer> ds,int s,int sum,int arr[],int n){
        if (ind==n) {
            if (s==sum) {
                System.out.println(ds);
                return true;
                
            }
            else return false;
            
        }
        // take
        ds.add(arr[ind]);
        s+=arr[ind];
        if (printS(ind+1, ds, s, sum, arr, n)==true) {
            return true;
            
        }

        s-=arr[ind];
        ds.remove(ds.size()-1);
// not take
        if (printS(ind+1, ds, s, sum, arr, n)==true) return true;

        return false;
        


    }

    public static void main(String[] args) {
        List<Integer> ds=new ArrayList<>();
        int arr[]={1,2,1};
        int sum=2;
        int n=3;
        printS(0, ds, 0, sum,arr, n);
        
    }
    
}
