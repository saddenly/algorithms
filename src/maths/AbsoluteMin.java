package maths;

public class AbsoluteMin {
    public static void main(String[] args) {
        System.out.println(absMin(new int[]{1, -2, 18, 10, -22}));
    }

    public static int absMin(int[] nums) {
        int absMinValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(absMinValue)) {
                absMinValue = nums[i];
            }
        }
        return absMinValue;
    }
}