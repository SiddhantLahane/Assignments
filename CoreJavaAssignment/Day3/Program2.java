package in.acts.cdac;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in decimal format to convert it into integer");
		double number = sc.nextDouble();
		int number2= (int)number;
		
		System.out.println(number2);
		
				
sc.close();

	}

}
