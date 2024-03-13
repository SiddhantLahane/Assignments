package in.acts.cdac;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	// Write a program that checks if a given year is a leap year or not using both if-else and
	//switch-case.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int year = sc.nextInt();
		
		if(year%2==0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
