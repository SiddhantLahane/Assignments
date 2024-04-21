// 13.	 Write a Java program to compare two linked lists.

import java.util.LinkedList;
class Ques13 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        //second linked list
        LinkedList<String> color2 = new LinkedList<>();
        color2.add("red");
        color2.add("yello");
        color2.add("white");
        color2.add("Green");

        boolean equal = color.equals(color2);

        if(equal){

            System.out.println("The two linked lists are equal.");
        } else {
            System.out.println("The two linked lists are not equal.");        }
        
    }
}