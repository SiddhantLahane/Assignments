
// 7.	Write a Java program to print all the elements of a ArrayList using the position of the elements.

import java.util.ArrayList;
class Ques7 {
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("yello");
        color.add("white");
        color.add("Green");

        for (String i : color) {
            System.out.println(i);
        }

        for(int i =0 ; i<color.size();i++){
            System.out.println(i +" at this postition "+ color.get(i));
        }
    }
}