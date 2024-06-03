import java.util.Scanner;

public class sum_of_first_n_numbers_parameterised {

    public static void sum(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        sum(n, 0);
        
    }
    
}
