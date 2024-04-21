// 4.	Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
class Ques4{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(45);
        num.add(67);
        num.add(67);

        for (Integer i : num) {
            System.out.println(i);
        }

        Collections.sort(num);
        System.out.println(num);
    }
}