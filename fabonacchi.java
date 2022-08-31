import java.util.Scanner;
public class fabonacchi {
    public static void fabseries(int num){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i=1;i<=num;i++){
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms you want to print :");
        int n = sc.nextInt();
        fabseries(n);
        
    } 
    
}
