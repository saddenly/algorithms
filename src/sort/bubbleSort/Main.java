package sort.bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 5, 3, 10, 0, 11, -5};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return nums;
    }
}
