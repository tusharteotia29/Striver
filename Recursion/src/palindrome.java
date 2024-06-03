import java.util.Scanner;

public class palindrome {

    public static boolean palindrome_check(int i,String str){
        if (i>=(str.length()/2)) {
            return true;

            
        }
        if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
            return false;
            
        }
        return palindrome_check(i+1, str);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.next();

        System.out.println(palindrome_check(0, n));
        
    }
    
}
