public class PalindromicString{
    public static void main(String[] args){
        String str= "Madam";
        String rev = new StringBuilder(str).reverse().toString();
        
        if(str.equalsIgnoreCase(rev)){
            System.out.println(str+ " is Palindromic.");
        }else{
            System.out.println(str+" is not Palindromic.");
        }
    }
}
