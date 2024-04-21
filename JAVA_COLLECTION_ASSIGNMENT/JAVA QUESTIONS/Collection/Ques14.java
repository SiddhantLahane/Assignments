// 14.	Write a Java program to replace an element in a linked list.


import java.util.LinkedList;
class Ques14 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }
        color.set(0,"RED");
        System.out.println(color);
    }
}