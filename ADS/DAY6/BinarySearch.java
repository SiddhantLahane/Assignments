package assignment6;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

          
            if (arr[mid] == target) {
                return mid;
            }

            
            if (arr[mid] < target) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 4, 10, 40};  // Must be sorted
        int target = 10;

        int result = binarySearch(data, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
