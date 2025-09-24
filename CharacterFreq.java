import java.util.*;

public class CharacterFreq{
    public static void main(String[] args){
        String str = "Hippopotomonstrosesquippedaliophobia";
        
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch:str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
    }
}