import java.util.Scanner;

public class print_n_to_1_backtrack {

    public static void print(int i,int n){

        if (i>n) {
            return;
            
        }
        print(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        print(1, m);
        
    }
    
}
