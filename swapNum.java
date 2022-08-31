public class swapNum{

    public static void swap(int a, int b) {
        b = b+a;
        a = b-a;
        b = b-a;    
        System.out.println("After Swapping: a is " +a+ " and b is "+b );
    }
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 20;
        swap(a1,b1);
        
    }
}