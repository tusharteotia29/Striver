import java.util.ArrayList;
import java.util.List;

public class print_all_subsequence {

    public static void printF(int ind, List<Integer> ls,int arr[],int n){
        if (ind==n) {
            
            if (ls.size()==0) {
                System.out.println("{}");
                
            }else{
                System.out.println(ls);
            }
            return;
        }
        
        // take or pick the particular index into the subsequence
        ls.add(arr[ind]);
        printF(ind+1, ls, arr, n);
        ls.remove(ls.size()-1);
        // not pick, or not take condition, this element is not added to your subsequence
        printF(ind+1, ls, arr, n);
    } 

    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=3;
        List<Integer> ls=new ArrayList<>();
        printF(0, ls, arr, n);
    }
    
}
