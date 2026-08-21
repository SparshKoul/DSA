class Quick {

    // Partition function:
    // This function places the pivot element at its correct position
    // and rearranges all smaller elements to the left
    // and all greater elements to the right
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high]; // choose last element as pivot

        int i = low - 1; // index of smaller element
                         // (tracks position where next smaller element should go)

        // Traverse the array from low to high-1
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {

                i++; // move boundary of smaller elements

                // Swap arr[i] and arr[j]
                // This puts smaller element in correct left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // After loop, place pivot in correct sorted position
        // All elements before (i+1) are smaller, after are greater
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }

    // Quick Sort function
    static void quickSort(int arr[], int low, int high) {

        // Base case: if only 1 or no element, already sorted
        if (low < high) {

            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pi - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {

        // Input array
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call quick sort on full array
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}