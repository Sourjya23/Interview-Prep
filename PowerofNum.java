import java.util.*;

public class PowerofNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextFloat();
        System.out.print("Enter power : ");
        double x = sc.nextFloat();
        double ans = 1;
        double original = n;
        
        if(n==0 || n==1){
            System.out.print(n+" ");
        }
        
        if(x<0){
            n = 1/n;
            x=-(x+1);
            ans = ans*n;
        }
        
        while(x>0){
            if(x%2==1){
                ans = ans*n;
                x=x-1;
            }else{
                x=x/2;
                n=n*n;
            }
        }
        System.out.print(ans+" ");
    }
}