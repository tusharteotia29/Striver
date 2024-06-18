import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Unions_of_two_sorted_arrays {


    // brute approach

    //  public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    // {
    //     // add your code here
    //     ArrayList<Integer> Union=new ArrayList<>();
    //     HashSet<Integer> s=new HashSet<>();
        
    //     for(int i=0;i<n;i++){
    //         s.add(arr1[i]);
    //     }
        
    //     for(int i=0;i<m;i++){
    //         s.add(arr2[i]);
    //     }
        
    //     for(int it:s){
    //         Union.add(it);
    //     }
    //     Collections.sort(Union);
    //     return Union;
    // }

     // optimal approach
    
     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> union=new ArrayList<>();
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0 || union.get(union.size()-1) !=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1) !=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(i<n){
             if(union.size()==0 || union.get(union.size()-1) !=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            
        }
        
        while(j<m){
             if(union.size()==0 || union.get(union.size()-1) !=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
        }
        
        return union;
    }

    public static void main(String[] args) {
        
    }
    
}
