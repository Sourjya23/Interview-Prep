
public class LargestSmallest{
    public static void main(String[] args){
        int[] arr = {20,3,5,11,98};
        
        int min = arr[0],max=arr[0];
        
        for(int num: arr ){
            if(num>max)max=num;
            if(num<min)min=num;
        }
        System.out.println("largest: "+max);
        System.out.println("smallest: "+min);
    }
}