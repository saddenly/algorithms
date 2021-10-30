package sort;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 24, 7, 79, 2, 55, 232, 10, 13};
        SelectionSort selectionSort = new SelectionSort();
        Integer[] sorted = selectionSort.sort(arr);

        for (int i = 0; i < sorted.length - 1; i++) {
            System.out.println(sorted[i] < sorted[i + 1]);
        }

        String[] strings = {"c", "a", "e", "b", "d"};
        String[] sortedStrings = selectionSort.sort(strings);

        for (int i = 0; i < sortedStrings.length - 1; i++) {
            System.out.println(strings[i].compareTo(strings[i + 1]) <= 0);
        }
    }

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int midIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[midIndex].compareTo(arr[j]) > 0) {
                    midIndex = j;
                }
            }
            if (midIndex != i) {
                T temp = arr[i];
                arr[i] = arr[midIndex];
                arr[midIndex] = temp;
            }
        }
        return arr;
    }
}