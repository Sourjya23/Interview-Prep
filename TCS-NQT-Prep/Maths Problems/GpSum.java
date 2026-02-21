import java.util.*;

public class GpSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter first term (a): ");
        float a = sc.nextFloat();

        System.out.print("Enter common ratio (r): ");
        float r = sc.nextFloat();

        float sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += a;
            a *= r;
        }

        System.out.println("Sum of GP = " + sum);
    }
}