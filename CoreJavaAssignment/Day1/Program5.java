package in.acts.cdac;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// Write a program that takes a character as input and determines whether it’s a vowel or a
		//consonant using if-else
		// A E I O U
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a consonant");
		}
sc.close();
	}

}
