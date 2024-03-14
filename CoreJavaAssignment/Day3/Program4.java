package in.acts.cdac;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer number");
		int num1 = sc.nextInt();
		
		double num2 = num1;
		System.out.println("conversion from int to double "+ num2);
		
		float num3 = num1;
		System.out.println("conversion from int to float "+ num3);
		
		boolean num4 = num1!=0;
		System.out.println("conversion from int to boolean "+ num4);
		
		String ch = String.valueOf(num1);
		System.out.println("conversion from int to String "+ ch);	
		
		sc.close();
	}

}
