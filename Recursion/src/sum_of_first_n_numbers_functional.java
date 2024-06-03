import java.util.Scanner;

public class sum_of_first_n_numbers_functional {

    public static int sum(int n){
        if (n==0) {
            return 0;
            
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(sum(n));
    }
    
}
