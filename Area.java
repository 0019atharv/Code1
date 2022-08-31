import java.util.Scanner;
public class Area {
    public static void areaofcone(float r, float l){
        double tsa = (3.14*r*r)+(3.14*r*l);
        System.out.println("Total Surface Area Of Cone is : "+ tsa);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cone: ");
        float radius = sc.nextInt();
        System.out.println("Enter the length of Cone: ");
        float length  = sc.nextInt();
        areaofcone(radius,length);
    }
}
