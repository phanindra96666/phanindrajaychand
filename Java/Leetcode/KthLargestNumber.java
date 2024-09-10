public class KthLargestNumber {
    
    // Function to find the largest number in the array
    public static int largestNumber(int[] arr, int k) {
        // Repeat the process to find the k-th largest
        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE; // Initialize max as the smallest possible value
            int maxIndex = -1; // Store the index of the largest element
            
            // Find the largest number in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j]; // Update max with the current largest element
                    maxIndex = j; // Store the index of the current largest element
                }
            }
            
            // If we've reached the k-th iteration, return the max value
            if (i == k - 1) {
                return max;
            }
            
            // Mark the found largest number as "used" by setting it to Integer.MIN_VALUE
            arr[maxIndex] = Integer.MIN_VALUE;
        }
        
        return -1; // In case k is out of bounds, return -1
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11, 15}; // Example array
        int k = 3; // Find the 3rd largest number
        System.out.println("The " + k + "-th largest number is: " + largestNumber(arr, k));
    }
}
