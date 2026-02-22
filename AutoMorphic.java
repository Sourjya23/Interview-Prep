import java.util.*;

    public class AutoMorphic{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int original = num;
            int sq= num*num;
            boolean isAutoMorphic = true;
            
            while(num>0){
                if(num%10 != sq%10){
                   isAutoMorphic=false;
                   break;
                }else{
                    num/=10;
                    sq/=10;
                }
            }
            if(isAutoMorphic){
                System.out.print(original + " is Automorphic");
            }else{
                System.out.print(original + " is not Automorphic");
            }
        }
    }
