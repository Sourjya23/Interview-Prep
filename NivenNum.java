import java.util.*;

    public class NivenNum{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            int num = sc.nextInt();
            int sum = 0;
            int temp =num;
            
            while(num>0){
                int digit = num%10;
                sum = sum+digit;
                num/=10;
            }
            if(temp%sum==0){
                System.out.print(temp+ " is Niven number");
            }else{
                System.out.print(temp+ " is not Niven number");
            }
        }
    }
