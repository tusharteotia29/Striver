import java.util.Scanner;

public class print_1_to_n_backtrack {


    public static void print(int i,int n){
        if (i<1) {
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        print(m, m);
        
    }
    
}
