import java.util.*;

public class PalindromeNumRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        for(int i = num1;i<=num2;i++){
            int n = i;
            int reverse = 0;
            
            while(n>0){
                int digit = n%10;
                reverse = reverse*10+digit;
                n/=10;
            }
            if(reverse==i){
            System.out.print(i+" ");
        }
        }
    }
}