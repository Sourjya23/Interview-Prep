import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int k = String.valueOf(num).length();
        int sum=0;
        
        int original = num;
        while(original>0){
            int digit = original%10;
            sum += (int) Math.pow(digit,k);
            original/=10;
        }
        if(sum==num){
            System.out.print(num+ " is Armstrong.");
        }else{
            System.out.print(num+ " is not Armstrong.");
        }
    }
}