// 2.	Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
class Ques2{
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        color.add(0,"purple");
        for (String i : color) {
            System.out.println(i);
        }
    }
}