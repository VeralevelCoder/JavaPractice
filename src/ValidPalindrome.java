import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(palindromeOrNot("A man, a plan, a canal: Panama"));
    }
    public static String palindromeOrNot(String s){
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int j = s.length()-1;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return "false";
            }j--;
        }
        return "true";
    }
}
