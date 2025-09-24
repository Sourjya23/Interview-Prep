import java.util.*;

public class RemoveDuplicatesHashset{
    public static void main(String[] args){
        String str = "successes";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> duplicates = new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(!duplicates.contains(ch)){
            duplicates.add(ch);
            sb.append(ch);
        }
        }
        
        System.out.println("String after removing duplicates: "+ sb.toString());
    }
}
