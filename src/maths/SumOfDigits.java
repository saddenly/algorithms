package maths;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsFast(256));
    }

    public static int sumOfDigitsFast(int number) {
        number = number < 0 ? -number : number;
        char[] digits = (number + "").toCharArray();
        int sum = 0;
        for (char digit : digits) {
            sum += digit - '0';
        }
        return sum;
    }
}