package strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("olleh".equals(reverse("hello")));
        System.out.println("lamentable".equals(reverse("elbow")));

        // Or...
        System.out.println(new StringBuilder("hello")
                .reverse()
                .toString()
                .equals("olleh"));
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}