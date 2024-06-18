import java.util.Arrays;
import java.util.Scanner;
public class fibbonacci {

        // Memoization

        public static int f(int dp[],int n){
            if (n<=1) {
                return n;
                
            }

            if (dp[n] != -1) {
                return dp[n];
                
            }

            return dp[n]=f(dp, n-1) + f(dp, n-2);

        }
        public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int dp[]=new int[n+1];
            Arrays.fill(dp, -1);
            System.out.println(f(dp,n));

            
        }    

        // Tabulation

        public static void main(String[] args) {
            
            int n=5;
            int dp[]=new int[n+1];

            dp[0]=0;
            dp[1]=1;
            for (int i = 2; i < n; i++) {
                dp[i]=dp[i-1]+dp[i-2];
                
            }

            System.out.println(dp[n]);

        }


        // Space optimaton

        public static void main(String[] args) {
            int prev=1;
            int prev2=0;
            int n=5;

            for (int i = 2; i < n; i++) {
                int curri=prev+prev2;
                prev2=prev;
                prev=curri;

                
            }
            System.out.println(prev);
        }
}
