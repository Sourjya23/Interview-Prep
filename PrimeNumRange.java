import java.util.*;

public class PrimeNumRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min range: ");
        int min = sc.nextInt();
        System.out.print("Enter max range: ");
        int max = sc.nextInt();
        
        for(int i=min;i<=max;i++){
            if(i<2)continue;
            
            boolean isPrime = true;
            for(int j = 2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}