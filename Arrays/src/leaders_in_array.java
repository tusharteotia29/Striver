import java.util.ArrayList;
import java.util.Collections;

public class leaders_in_array {



     static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        // ans.add(arr[n-1]);
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maxi){
                ans.add(arr[i]);
                
            }
    
            maxi=Math.max(maxi,arr[i]);
        }
        
        Collections.reverse(ans);
        
        return ans;
        
       
       
       
    }
    public static void main(String[] args) {
        
    }
    
}
