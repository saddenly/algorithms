package sort.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 5, 3, 10, 0, 11, -5};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        return nums;
    }
}