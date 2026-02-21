import java.util.*;

public class MaxMinDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int mindigit=9,maxdigit=0;
        
        while(num>0){
            int digit=num%10;
            if(digit>maxdigit){
                maxdigit=digit;
            }else if(digit<mindigit && digit!=maxdigit){
                mindigit=digit;
                
            }
            num/=10;
        }
        System.out.println("min digit: "+mindigit); 
        System.out.print("max digit: "+maxdigit);
        sc.close();
    }
}