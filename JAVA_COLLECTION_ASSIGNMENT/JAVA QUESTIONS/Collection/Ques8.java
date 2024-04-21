// 8.	Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;
import java.util.Collections;
class Ques8 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }
        //adding at end
        color.add("purple");
        System.out.println(color);
    }
}