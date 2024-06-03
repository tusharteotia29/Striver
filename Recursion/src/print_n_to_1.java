import java.util.Scanner;

public class print_n_to_1 {

    public static void print(int i,int n){
        if (i<1) {
            return;
            
        }
        System.out.println(i);
        print(i-1, n);

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        print(m, m);
    }
    
}
