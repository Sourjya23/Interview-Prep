import java.util.*;

public class LargestofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");

        int a =sc.nextInt(),b=sc.nextInt();
        
        int max = a;
        
        if(b>max){
            max = b;
        }
        
        System.out.println("Largest of two: " + max);
        sc.close();
    }
}
