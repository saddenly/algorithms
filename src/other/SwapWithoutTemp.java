package other;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 20, b = 10;
        String word1 = "Io", word2 = "Tu";

        swapInt(a, b);
        swapString(word1, word2);
    }

    public static void swapString(String a, String b) {
        b = b + a;
        a = b.substring(0, b.length() - a.length());
        b = b.substring(a.length());
        System.out.println(a + ":" + b);
    }

    public static void swapInt(int a, int b) {
        /*
        a += b;
        b = a -b;
        a -= b;
         */
        a = a + b - (b = a);
        System.out.println(a + ":" + b);
    }
}