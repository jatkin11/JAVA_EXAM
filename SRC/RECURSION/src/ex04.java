public class ex04 {

    public static boolean isPalindrome(String s)
    {
        if(s.length() <= 1){return true;}

        return s.charAt(0) == s.charAt(s.length()-1) &&
        isPalindrome(s.substring(1,s.length()-1));
    }


    static void main() {
        System.out.println(isPalindrome("banab"));
    }


}
