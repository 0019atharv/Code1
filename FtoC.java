import java.util.Scanner;
public class FtoC {
    public static void temp(float c){
        float f = c*(9/5)+32;
        System.out.println("Temperature in Fahrenhiet is : "+ f);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temp. in Celcius: ");
        float celcius = sc.nextInt();
        temp(celcius);
    }
}
