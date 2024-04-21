// 12.	 Write a Java program to check if a particular element exists in a linked list.

// 11.	Write a Java program to display the elements and their positions in a linked list. 

import java.util.LinkedList;
class Ques12 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }
        String key = "Green";
        boolean present = color.contains(key);

        if(present){

            System.out.println("The element '" + key + "' exists in the linked list.");
        } else {
            System.out.println("The element '" + key + "' does not exist in the linked list.");
        }
        
    }
}