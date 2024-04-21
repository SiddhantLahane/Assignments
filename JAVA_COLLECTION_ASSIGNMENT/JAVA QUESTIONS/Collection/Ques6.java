// 6.	Write a Java program of swap two elements in an array list.

import java.util.ArrayList;

public class Ques6 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");

        // Print out the original list
        System.out.println("Original list:");
        System.out.println(colorsList);

        // Indices of the elements to swap
        int index1 = 1; // Index of the first element to swap
        int index2 = 2; // Index of the second element to swap

        // Swap the elements
        swapElements(colorsList, index1, index2);

        // Print out the list after swapping
        System.out.println("\nList after swapping elements at indices " + index1 + " and " + index2 + ":");
        System.out.println(colorsList);
    }

    // Method to swap elements at specified indices in an ArrayList
    public static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            T temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        } else {
            System.out.println("Invalid indices. Unable to swap elements.");
        }
    }
}
