package in.acts.cdac;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter num1 ");
		int num1= sc.nextInt();
		
		System.out.println(" Enter num2 ");
		int num2= sc.nextInt();
		
		System.out.println("enter 1 for addition, 2 for subtraction, 3 for mltiplication, 4 for division");
		int calculator = sc.nextInt();
		
		switch(calculator) {
		
		case 1:
			System.out.println(num1+num2);
			break;
			
		case 2:
			System.out.println(num1-num2);
			break;
			
		case 3:
			System.out.println(num1*num2);
			break;
			
		case 4:
			System.out.println(num1/num2);
			break;
			
		default :
			System.out.println("Please select the proper input between 1-4");
			
		

	}
   sc.close();
}
}
