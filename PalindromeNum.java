import java.util.*;

public class PalindromeNum{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int original = num;
    int reverse = 0;
    
    while(num>0){
        int digit = num%10;
        reverse = reverse*10 + digit;
        num/=10;
    }
    if(reverse==original){
        System.out.println(original+ " is Palindrome");
    }else{
        System.out.println(original+ " is not Palindrome");
    }
    sc.close();
    }
}