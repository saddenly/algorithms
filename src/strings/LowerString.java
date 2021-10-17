package strings;

public class LowerString {
    public static void main(String[] args) {
        System.out.println(toLowerCase("STRING IN CAPS"));
    }

    public static String toLowerCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }
}