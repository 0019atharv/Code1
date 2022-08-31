import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,sum=0,temp;    
        System.out.println("Enter the Number to check palindrome or not: ");
        int n = sc.nextInt();
    
        temp=n;    
        while(n>0){    
        r=n%10;  
        sum=(sum*10)+r;    
        n=n/10;    
        }    
        if(temp==sum)    
        System.out.println("palindrome number ");    
        else    
        System.out.println("not palindrome");    
        }
}

