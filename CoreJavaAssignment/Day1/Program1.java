package in.acts.cdac;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your percentage");
		float percent = sc.nextFloat();
		
		if(percent >= 80) {
			System.out.println("Your grade is A");
		}
		else if(percent <80 && percent >=60 ) {
			System.out.println("Your grade is B");
		}
		else if(percent <60 && percent >=40 ) {
			System.out.println("Your grade is C");
		}
		else {
			System.out.println("Your grade is D");
		}
		sc.close();
	}

}
