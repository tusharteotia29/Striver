import java.util.Scanner;



public class fibonacci {

    public static int f(int n){
        if (n<=1) {
            return n;
            
        }
        int last = f(n-1);
        int slast=f(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println(f(n));
        
    }
    
}
