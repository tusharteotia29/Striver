import java.util.Scanner;

public class print_1_to_n {

    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        print(1, m);
        
    }
    
}
