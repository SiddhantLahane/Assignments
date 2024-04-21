// 1.	Write a Java program to create a new array list, add some colors (string) and print out the collection.


import java.util.ArrayList;
class Ques1 {
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }
    }
}