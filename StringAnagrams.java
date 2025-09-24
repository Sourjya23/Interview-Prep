//Take two strings
//Make those strings into charArray.
//Sort those charArrays.
//check if same using Arrays.equals()
//print the o/p.
import java.util.*;


public class StringAnagrams{
    public static void main(String[] args){
        String str1 = "silent";
        String str2 = "listen";
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both strings are Anagram.");
        }else{
            System.out.println("Both strings are not Anagram.");
        }
    }
}