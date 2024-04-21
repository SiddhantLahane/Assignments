// 9.	Write a Java program to insert the specified element at the specified position in the linked list.


import java.util.LinkedList;
import java.util.Collections;
class Ques9 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }
        //adding at end 2nd postion
        color.add( 2 ,"purple");
        System.out.println(color);
    }
}