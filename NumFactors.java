import java.util.*;

public class NumFactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        ArrayList<Integer> factors = new ArrayList<>();
        
        for(int i = 1;i*i<num;i++){
            if(num%i==0){
                factors.add(i);
                if(num/i!=i){
                    factors.add(num/i);
                }
            }
        }
        Collections.sort(factors);
        System.out.print("factors: ");
        for(int x: factors){
            System.out.print(x+" ");
        }
    }
}