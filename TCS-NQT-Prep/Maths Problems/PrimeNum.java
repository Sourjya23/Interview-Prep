import java.util.*;

public class PrimeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime=true;
        
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is Prime");
        }else{
            System.out.println(num+" is not Prime");
        }
    }
}