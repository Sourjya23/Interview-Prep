import java.util.*;

public class StrongNum{
    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=0,original=num;
        
        
        while(num!=0){
            int digit = num%10;
            sum = sum+factorial(digit);
            num/=10;
        }
        
        if(sum==original){
            System.out.print("Strong Number");
        }else{
            System.out.print("Not Strong Number");
        }
    }
}