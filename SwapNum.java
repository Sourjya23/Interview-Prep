import java.util.*;

public class SwapNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        
        int a = sc.nextInt(),b = sc.nextInt();
        
        System.out.println("Two numbers a and b before swap: "+ a + " and " +b ); 
        
         a = a+b;
         b = a-b;
         a = a-b;
         
         System.out.println("Two numbers a and b after swap: " + a+" and "+b);
        
        
        sc.close();
    }
}