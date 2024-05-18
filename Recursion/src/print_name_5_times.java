import java.util.Scanner;

public class print_name_5_times {

    public static void print(int i,int m){
        if (i>m) {
            return;

        }
        System.out.println("tushar");
        print(i+1, m);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(1,n);
    }
    
}
