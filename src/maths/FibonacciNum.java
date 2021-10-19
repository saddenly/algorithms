package maths;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(1));
        System.out.println(isFibonacciNumber(2));
        System.out.println(isFibonacciNumber(3));
        System.out.println(isFibonacciNumber(21));
        System.out.println(isFibonacciNumber(11));
        System.out.println(isFibonacciNumber(34));
    }

    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static boolean isFibonacciNumber(int num) {
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }
}