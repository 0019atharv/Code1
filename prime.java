import java.util.Scanner;
public class prime {

    public static boolean isPrime(int n){
        if (n==0 || n==1){
            return false;
        }
        if (n==2){
            return true;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }

        }
        return true;
    }
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check : ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }    
}