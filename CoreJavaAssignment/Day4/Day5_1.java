package org.example.main;

import java.util.Scanner;

public class Student {

	String name;
	int id;
	char division;

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :  ");
		name = sc.nextLine();
		System.out.println("Enter id : ");
		id = sc.nextInt();
		System.out.println("Enter division : ");
		division = sc.next().charAt(division);

		sc.close();
	}

	public void displayData() {
		System.out.println("name : " + this.name + " id : " + this.id + " division : " + this.division);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.acceptData();
		student.displayData();

	}

}
