public class largest {

    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            
            // If pivot index matches k, we found our k-th largest
            if (pivotIndex == k) {
                return arr[pivotIndex];
            } else if (pivotIndex > k) {
                // Search in the left sub-array
                return quickSelect(arr, low, pivotIndex - 1, k);
            } else {
                // Search in the right sub-array
                return quickSelect(arr, pivotIndex + 1, high, k);
            }
        }
        return -1; // This should not happen if k is valid
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the rightmost element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is greater than or equal to pivot
            if (arr[j] >= pivot) {
                i++; // Increment index of larger element
                swap(arr, i, j); // Swap the elements
            }
        }
        // Swap the pivot element to its correct position
        swap(arr, i + 1, high);
        return i + 1; // Return the partition index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int k = 3; // For the 3rd largest element
        int n = arr.length;

        // Adjust k for 0-based index (k-th largest is (n-k)-th smallest)
        int result = quickSelect(arr, 0, n - 1, n - k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}