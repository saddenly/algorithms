package strings;

public class SameCharacter {
    public static void main(String[] args) {
        System.out.println(isAllCharsSame("aaaa"));
        System.out.println(isAllCharsSame("1111"));
        System.out.println(isAllCharsSame("sooos"));
        System.out.println(isAllCharsSame("ppppe"));
    }

    public static boolean isAllCharsSame(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}