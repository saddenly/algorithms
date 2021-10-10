package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 10, 0, 11, 26};
        System.out.println(linearSearch(nums, 72));
    }

    public static int linearSearch(int[] nums, int x) {
        for (int num : nums) {
            if (num == x) {
                return num;
            }
        }

        return -1;
    }
}