//This is problem to sort an unsorted array

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Unsorted array
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
