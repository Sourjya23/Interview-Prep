//first non repeating character in a string. 
//count frequency of characters--> nonrepeating if freq.get(ch)==1 diye break
import java.util.*;

public class FirstNonRepeating{
    public static void main(String[] args){
        String str="Ramim";
        
        HashMap<Character,Integer> freq = new HashMap<>();
        
        //freq count
        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        
        char result='\0';
        for(char ch : str.toCharArray()){
            if(freq.get(ch)==1){
                result=ch;
                break;
            }
        }
        if(result!='\0'){
            System.out.println("First non repeating character: "+result);
        }else{
            System.out.println("no non repeating character ");
        }
    }
}