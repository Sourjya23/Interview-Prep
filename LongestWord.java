//find the longest word in the sentence. 
//Approach: 
//Sentence ta re ekta string ey felao for now.
//words gula re split koro using sentence.split(" ")
//initialise string longest which will store the longest word from a sentence.
//each word iterate koro like this (String word: str)
//then if ey condition lagao word.length()>longest.length(),update longest=word
//print the result

public class LongestWord{
    public static void main(String[] args){
        String str = "Pneumonoultramicroscopicsilicovolcanoconiosis and floccinaucinihilipilification bewildered the antidisestablishmentarianism scholar.";
        String[] words = str.split(" ");
        
        String longestword = " ";
        
        for(String word:words){
            if(word.length()>longestword.length()){
                longestword=word;
            }
        }
        System.out.println("Longest word: "+longestword);
    }
}