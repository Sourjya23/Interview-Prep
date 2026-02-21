import java.util.*;

public class PerfectNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        if(num<=1){
            System.out.print("Not a perfect number");
            return;
        }
        
        for(int i=1;i<=num-1;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.print(num+ " is Perfect number.");
        }else{
            System.out.print(num+ " is not Perfect number.");
        }
    }
}