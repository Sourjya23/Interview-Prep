//Check if the String only contains digit and no character. 

//String nao
//boolean diye onlydigit function niya oida re true set koro
//check and print

public class OnlyDigits{
    public static void main(String[] args){
        String str = "12232455aas2";
        
        boolean onlydigits=true;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                onlydigits=false;
                break;
            }
        }
        if(onlydigits){
            System.out.println("string contains only digits.");
        }else{
            System.out.println("string Doesn't contain only digits.");
        }
    }
}