// 11.	Write a Java program to display the elements and their positions in a linked list. 

import java.util.LinkedList;
class Ques11 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }

        for (int i =0;i<color.size();i++){
            System.out.println(i+" at this positon "+color.get(i));
        }
    }
}