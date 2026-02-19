import java.util.*;

public class SumofTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(),b = sc.nextInt();
        System.out.println("Sum: "+ (a+b));
        sc.close();
    }
}