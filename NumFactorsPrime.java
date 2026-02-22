import java.util.*;

public class NumFactorsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime divisors: ");

        // Handle factor 2
        if (n % 2 == 0) {
            System.out.print(2 + " ");
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Handle odd factors
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.print(i + " ");
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // Remaining prime factor
        if (n > 1) {
            System.out.print(n);
        }

        sc.close();
    }
}