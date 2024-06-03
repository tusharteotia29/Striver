public class count_the_subsequence_with_sum_k {

    public static int countS(int ind,int ar[],int s,int sum ,int n){
        if (ind==n) {

            if (s==sum) {
                return 1;
                
            }
            else return 0;
            
        }

        s+=ar[ind];
        int l=countS(ind+1, ar, s, sum, n);

        s-=ar[ind];

        int r=countS(ind+1, ar, s, sum, n);

        return l+r;

    }

    public static void main(String[] args) {

        int arr[]={1,2,1};
        int n=3;
        int sum=2;
        System.out.println(countS(0, arr, 0, sum, n));
        
    }
    
}
