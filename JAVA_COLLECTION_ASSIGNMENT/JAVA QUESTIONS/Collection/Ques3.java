// 3.	Write a Java program to retrieve an element (at a specified index) from a given array list.
//  list at the first and last position.


import java.util.ArrayList;
class Ques3{
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        color.add(0,"purple");

        String first = color.get(0);
        String last = color.get(color.size()-1);
        for (String i : color) {
            System.out.println(i);
        }
        System.out.println("Element at the first position: " + first);
        System.out.println("Element at the last position: " + last);
    }
}