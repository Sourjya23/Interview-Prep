import java.util.*;

    public class GCD {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            int num = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int num1 = sc.nextInt();
            
            while(num>0 && num1>0){
                if(num>num1){
                    num = num%num1;
                }else{
                    num1 = num1%num;
                }
            }
            if(num==0){
                System.out.print(num1+ " is the GCD");
            }else{
                System.out.print(num+ " is the GCD");
            }
        }
    }
