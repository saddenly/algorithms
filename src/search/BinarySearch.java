package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 10, 11, 15, 26};
        int result = binarySearch(nums, 0, nums.length - 1, 126);
        if (result == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int startIndex, int endIndex, int x) {
        if (endIndex >= startIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, startIndex, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, endIndex, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}