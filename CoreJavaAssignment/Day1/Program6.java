package in.acts.cdac;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
//	)Implement a program that calculates the Body Mass Index (BMI) based on height and weight
//	input using if-else to classify the BMI int categories (underweight, normal weight, overweight,
//	etc.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height");
		float height = sc.nextFloat();
		System.out.println("Enter your weight");
		float weight = sc.nextFloat();
		float h = height*height;
		
		float BMI = (weight/h);
		
		if(BMI < 18.5) {
			System.out.println("you are in underweight category");
		}
		else if(BMI>=18.5 && BMI<=24.9) {
			System.out.println("you are in normalweight category");
		}
		else if(BMI>=25 && BMI<=29.9) {
			System.out.println("you are in overweight category");
		}
		else {
			System.out.println("you are in obeseweight category");
		}
		
		sc.close();

	}

}
