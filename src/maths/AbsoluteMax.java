package maths;

public class AbsoluteMax {
    public static void main(String[] args) {
        System.out.println(absMax(new int[]{0, -2, 18, 10, -22}));
    }

    public static int absMax(int[] nums) {
        int absMaxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) > Math.abs(absMaxValue)) {
                absMaxValue = nums[i];
            }
        }
        return absMaxValue;
    }
}