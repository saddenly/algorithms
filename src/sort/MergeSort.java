package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {-2, 5, 3, 10, 0, 11, -5};

        mergeSort(nums, 0, nums.length - 1);
        printArray(nums);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int[] leftArray = new int[lengthLeft];
        int[] rightArray = new int[lengthRight];

        System.arraycopy(arr, left, leftArray, 0, lengthLeft);
        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = arr[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < lengthRight) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}