import java.util.Scanner;
public class areacircle {
    
    public static void areaofcircle(float r){
        System.out.println("Area of Circle is : "+ (3.14*r*r));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float r = sc.nextInt();
        areaofcircle(r);
    }
    
}
