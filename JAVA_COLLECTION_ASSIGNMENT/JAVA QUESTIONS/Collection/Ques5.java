// 5.	 Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
class Ques5 {
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }

        Collections.reverse(color);
        System.out.println(color);
    }
}