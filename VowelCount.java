//count the number of vowels of string

public class VowelCount{
    public static void main(String[] args){
        String str= "New year New Circle";
        str = str.toLowerCase();
        
        int count=0;
        
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
        }
        System.out.println("No of vowels: "+count);
    }
}