import java.util.Scanner;

public class reverse_array {

    public static void reverse(int i, int arr[],int n){
        if (i>=n/2) {
            return;
            
        }
        // Swap the elements at index i and (n - i - 1)
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        // swap(arr[i],arr[n-i-1]);
        reverse(i+1, arr, n);

    }

   


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
            
        }

        reverse(0,arr,n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
    
}
