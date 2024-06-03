import java.util.ArrayList;
import java.util.List;

public class print_subsequence_sum_k {

    public static void printS(int ind, List<Integer> ds,int s, int sum,int arr[],int n){
        if (ind==n) {
            if (s==sum) {
                System.out.println(ds);
                
            }
            return;
            
        }
        // take
        ds.add(arr[ind]);
        s+=arr[ind];
        printS(ind+1, ds, s, sum, arr, n);

        s-=arr[ind];
        ds.remove(ds.size()-1);
// not take
        printS(ind+1, ds, s, sum, arr, n);
    }

    public static void main(String[] args) {
        List<Integer> ds=new ArrayList<>();
        int n=3;
        int arr[]={1,2,1};
        int sum=2;
        printS(0, ds, 0, sum, arr, n);
        
    }
    
}
