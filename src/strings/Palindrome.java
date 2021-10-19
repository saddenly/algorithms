package strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromic("ABBA"));
        System.out.println(isPalindromic("Is this"));
        System.out.println(isPalindromic("pooP"));
    }

    public static boolean isPalindrome(String s) {
        return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean isPalindromic(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }
}