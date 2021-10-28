package maths;

public class NumOfDigits {
    public static void main(String[] args) {
        int[] nums = {-100, -19,0, 20, 1000, 200, 100000, 20345, 23563665};
        for (int num : nums) {
            System.out.println(numberOfDigits(num));
        }
    }

    public static int numberOfDigits(int number) {
        return number < 0 ? (-number + "").length() : (number + "").length();
    }
}