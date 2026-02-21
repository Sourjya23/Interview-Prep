import java.util.*;

public class SumAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter first term (a): ");
        float a = sc.nextFloat();

        System.out.print("Enter common difference (d): ");
        float d = sc.nextFloat();

        float sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += a;
            a += d;
        }

        System.out.println("Sum of AP = " + sum);
    }
}