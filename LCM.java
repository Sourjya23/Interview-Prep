import java.util.*;

    public class LCM{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            int num = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int num1 = sc.nextInt();
            int res = Math.max(num,num1);
            
            while(true){
                if(res%num==0 && res%num1==0){
                    break;
                }
                res++;
            }
            System.out.print("LCM is: "+res);
        }
    }
