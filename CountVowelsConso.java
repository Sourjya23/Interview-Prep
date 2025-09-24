//Count vowels and consonants in string

//Take string
//lowercase banao
//character iteration korum one by one
//if a letter -> check vowel, else consonant
//print result

public class CountVowelsConso{
    public static void main(String[] args){
        String str = "Sourjya Mitra is the king.";
        str = str.toLowerCase();
        
        int vowels=0,consonants=0;
        
        for(char ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}