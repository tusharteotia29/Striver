public class check_if_array_is_sorted {

    boolean arraySortedOrNot(int[] arr, int n) {
        
        for(int i=1; i<n;i++){
            if(arr[i]>=arr[i-1]){
                
            }
            else{
                return false;
            }
            
            
        }
        return true;
        // code here
    }
    public static void main(String[] args) {
        
    }
    
}
