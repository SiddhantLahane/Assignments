package assignment6;

public class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] data = {3, 20, 15, 88, 23, 7, 34, 55};  
        int target = 23;  // Target to find

        int result = linearSearch(data, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

