import java.util.*;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int Smallest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < Smallest) {
                Smallest = a[i];
            }
        }

        System.out.println("Smallest number is: " + Smallest);
        sc.close();
    }
}

