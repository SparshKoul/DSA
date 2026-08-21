import java.util.*;

public class Merge {

    // This function recursively divides the array and sorts it
    public static void mergeSort(int arr[], int left, int right) {

        // Base case: if the array has 1 element, it's already sorted
        if (left >= right) {
            return;
        }

        // Find the middle index
        int mid = (left + right) / 2;

        // Recursively sort the left half
        mergeSort(arr, left, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, right);

        // Merge the two sorted halves
        merge(arr, left, mid, right);
    }

    // This function merges two sorted subarrays into one sorted array
    public static void merge(int arr[], int left, int mid, int right) {

        // Create a temporary array to store merged result
        int temp[] = new int[right - left + 1];

        // i → pointer for left subarray
        int i = left;

        // j → pointer for right subarray
        int j = mid + 1;

        // k → pointer for temp array
        int k = 0;

        // Compare elements from both subarrays and store smaller one in temp
        //left subarray k right most is mid and right subarray k right most is right.
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];  // take element from left
            } else {
                temp[k++] = arr[j++];  // take element from right
            }
        }

        // Copy remaining elements from left subarray (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray (if any)
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy all elements from temp back to original array
        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    public static void main(String args[]) {

        // Input array
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call merge sort on entire array
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
}