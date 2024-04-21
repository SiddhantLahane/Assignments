import java.util.LinkedList;
import java.util.Collections;
class Ques10 {
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
        color.add(5,"pink");
        color.add(6,"blue");
        color.add(1,"light green");
        
        System.out.println(color);
    }
}