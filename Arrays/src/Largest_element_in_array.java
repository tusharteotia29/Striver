public class Largest_element_in_array {

    public int largest(int arr[], int n)
    {
        
        int largest=arr[0];
        
        for(int i=0; i<n ; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args) {
        
    }
    
}
